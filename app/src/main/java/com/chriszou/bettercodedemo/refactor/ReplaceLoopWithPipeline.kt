package com.chriszou.bettercodedemo.refactor


class ReplaceLoopWithPipeline {

    fun averageRDSalary(): Double {

        val employees = allEmployees()

        return employees.filter { it.role == EmployeeRole.RD }
            .map { it.salary }
            .average()

//        var totalRDSalary = 0.0
//        var rdCount = 0
//        employees.forEach {
//            if (it.role == EmployeeRole.RD) {
//                totalRDSalary += it.salary
//                rdCount ++
//            }
//        }
//
//        return totalRDSalary / rdCount

    }

    private fun allEmployees(): List<Employee> {
        return emptyList()
    }
}