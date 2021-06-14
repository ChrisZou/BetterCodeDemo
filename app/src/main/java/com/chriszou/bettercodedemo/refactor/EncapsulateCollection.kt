package com.chriszou.bettercodedemo.refactor

class OrderRepo {
    private val orders = mutableListOf<Order>()

    fun allOrders(): List<Order> {
//        return orders
        return ArrayList(orders)
    }

    fun addOrder(order: Order) {
        orders.add(order)
    }

    fun removeOrder(order: Order) {
        orders.remove(order)
    }


}