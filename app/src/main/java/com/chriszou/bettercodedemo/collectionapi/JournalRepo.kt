package com.chriszou.bettercodedemo.collectionapi

import android.annotation.SuppressLint
import java.text.SimpleDateFormat

/**
 * 代表一篇日记
 * body: 内容
 * date: 日期，格式：yyyy-MM-dd，如："2021-06-01"
 */
data class Journal(val body: String, val date: String)

@SuppressLint("SimpleDateFormat")
object JournalRepo {
    private val allJournals = allSortedByDate()

    fun all(): List<Journal> {
        return allJournals.toList()
    }

    // `find {}`
    fun journalOfDate(date: String): Journal? {

        var targetJournal: Journal? = null
        for (journal in allJournals) {
            if (journal.date == date) {
                targetJournal = journal
            }
        }

        return targetJournal

        // use find

    }

    /**
     * filter {}, filterNotNull()
     * @param month, 目标月份，格式：yyyy-MM, 如："2021-05"
     */
    fun journalsOfMonth(month: String): List<Journal> {

        val targetJournals = mutableListOf<Journal>()
        allJournals.forEach {
            if (it.date.contains(month)) {
                targetJournals.add(it)
            }
        }

        return targetJournals

        // use filter
        allJournals.filter { it.date.contains(month) }

        // filterNotNull
    }

    /**
     * map
     */
    fun datesAndWords(): List<Pair<String, Int>> {
        val datesAndWords = mutableListOf<Pair<String, Int>>()
        allJournals.forEach {
            val date2wordCount = Pair(it.date, it.body.length)
            datesAndWords.add(date2wordCount)
        }

        return datesAndWords

        // use map
        allJournals.map { it.date to it.body.length }

        //use mapTo
    }

    /**
     * first() and last()
     * first {}, last {}
     * take(n), takeLast(n)
     */
    fun firstAndLast(): Pair<Journal?, Journal?> {
        if (allJournals.isEmpty()) {
            return null to null
        }
        return allJournals[0] to allJournals[allJournals.size - 1]

        //use first() and last()

        // first {} demo
    }

    /**
     * any, all, none
     */
    fun hasJournalOnDate(date: String): Boolean {
        allJournals.forEach {
            if (it.date == date) {
                return true
            }
        }
        return false

        // use any

        // all, none demo
    }

    /**
     * count
     * @param month, 目标月份，格式：yyyy-MM, 如："2021-05"
     */
    fun journalCountOfMonth(month: String): Int {
        var count = 0
        allJournals.forEach {
            if (it.date.contains(month)) {
                count ++
            }
        }

        return count

        //use count
        allJournals.count { it.date.contains(month) }

    }

    /**
     * maxOf, minOf, sum, average
     */
    fun longestJournal(): Journal? {
        var target: Journal? = null
        allJournals.forEach {
            if (it.body.length > target?.body?.length ?: 0) {
                target = it
            }
        }

        return target

        //use maxOf

        // minOf, sum

        // number list
        val ints = listOf(1, 2, 3, 4, 5)
        ints.maxOrNull()
        ints.minOrNull()
        ints.average()
        ints.sum()
    }

    /**
     * reduce, fold
     */
    fun weeklyCount(): MutableMap<String, Int> {
        val result = mutableMapOf<String, Int>()
        allJournals.forEach {
            val week = dateToWeek(it.date)
            result[week] = (result[week] ?: 0) + 1
        }

        return result

        // use fold
    }

    private val weekFormatter = SimpleDateFormat("yyyy.ww")
    private val dateFormat = SimpleDateFormat("yyyy-MM-dd")
    private fun dateToWeek(date: String): String {
        // "2021.01"
        return weekFormatter.format(dateFormat.parse(date))
    }

    private fun allSortedByDate(): List<Journal> {
        //想象下这是从本地数据库或网络获取的数据
        return emptyList()
    }

}

