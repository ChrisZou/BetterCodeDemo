package com.chriszou.bettercodedemo.refactor

class EncapsulateCollection

class OrderRepo {
    private val orders = mutableListOf<Order>()

    fun allOrders(): List<Order> {
        return orders
//        return ArrayList(orders)
        val tmp = ArrayList<Order>()
        orders.forEach { tmp.add(it) }
        return tmp
    }

    fun addOrder(order: Order) {
        orders.add(order)
    }

    fun removeOrder(order: Order) {
        orders.remove(order)
    }
}