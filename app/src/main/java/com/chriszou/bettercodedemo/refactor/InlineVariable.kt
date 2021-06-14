package com.chriszou.bettercodedemo.refactor

class InlineVariable {

    fun getFinalPrice(order: Order): Double {
        val basePrice = order.quantity * order.itemPrice
        val discount = Math.max(0, order.quantity - 500) * order.itemPrice * 0.05
        val shippingPrice = Math.min(basePrice * 0.1, 100.0)

        val finalPrice = basePrice - discount + shippingPrice
        return finalPrice
    }


    fun showUserCart(user: User) {

        val userId = user.id
        val orders = getUserOrders(userId)


        orders.forEach { println(it.itemPrice) }
    }


    private fun getUserOrders(userId: String): List<Order> {
        return emptyList<Order>()
    }

}