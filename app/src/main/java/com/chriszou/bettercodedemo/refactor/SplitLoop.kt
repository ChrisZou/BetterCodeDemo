package com.chriszou.bettercodedemo.refactor

enum class EmployeeRole { RD, UI, PM, QA}
class Employee(val age: Int, val salary: Double, val role: EmployeeRole)

class SplitLoop {

    fun averageAgeAndSalary(): Pair<Int, Double> {

        val employees = allEmployees()
        var totalAge = 0
        var totalSalary = 0.0

        employees.forEach {
            totalAge += it.age
            totalSalary += it.salary
        }
        val averageAge = totalAge / employees.size
        val averageSalary = totalSalary / employees.size


        return averageAge to averageSalary
    }

    private fun allEmployees(): List<Employee> {
        return emptyList()
    }
}