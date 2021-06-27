package com.chriszou.bettercodedemo.collectionapi

class CollectionApiDemo {

    fun dummy() {

        JournalRepo.all()
        JournalRepo.datesAndWords()
        JournalRepo.firstAndLast()
        JournalRepo.hasJournalOnDate("2021-06-26")
        JournalRepo.journalOfDate("2021-06-26")
        JournalRepo.journalCountOfMonth("2021-06-26")
        JournalRepo.journalsOfMonth("2021-06-26")
    }

}

