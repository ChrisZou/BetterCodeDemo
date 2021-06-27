package com.chriszou.bettercodedemo.refactor

class Order(val quantity: Int, val itemPrice: Double)
enum class Gender {MALE, FEMALE, UNKNOWN}
class User(val id: String, val username: String, val age: Int, val gender: Gender)

class IntroduceVariable {

    fun getFinalPrice(order: Order): Double {
        val basePrice = order.quantity * order.itemPrice
        val discount = Math.max(0, order.quantity - 500) * order.itemPrice * 0.05
        val shippingFee = Math.min(basePrice * 0.1, 100.0)

        return basePrice - discount + shippingFee
    }

    fun getMarried(user: User) {
        /**
         * ...other code...
         */

        val reachLegalMarriageAge = user.gender == Gender.MALE && user.age >= 18
                || user.gender == Gender.FEMALE && user.age >= 20
        if (reachLegalMarriageAge) {
            /**
             * 登记结婚
             */
        }

    }

}
