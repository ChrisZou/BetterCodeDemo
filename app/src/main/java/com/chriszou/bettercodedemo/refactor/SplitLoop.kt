package com.chriszou.bettercodedemo.refactor

enum class EmployeeRole { RD, UI, PM, QA}
class Employee(val age: Int, val salary: Double, val role: EmployeeRole)

class SplitLoop {

    fun averageAgeAndSalary(): Pair<Int, Double> {

        val employees = allEmployees()

        var totalAge = 0
        employees.forEach { totalAge += it.age }
        val averageAge = totalAge / employees.size

        var totalSalary = 0.0
        employees.forEach { totalSalary += it.salary }
        val averageSalary = totalSalary / employees.size

//        employees.forEach {
//            totalAge += it.age
//            totalSalary += it.salary
//        }
//


        return averageAge to averageSalary
    }

    private fun allEmployees(): List<Employee> {
        return emptyList()
    }
}






























