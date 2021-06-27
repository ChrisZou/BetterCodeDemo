package com.chriszou.bettercodedemo.refactor

class Order(val quantity: Int, val itemPrice: Double)
enum class Gender {MALE, FEMALE, UNKNOWN}
class User(val id: String, val username: String, val age: Int, val gender: Gender)

class IntroduceVariable {

    fun getFinalPrice(order: Order): Double {
        return order.quantity * order.itemPrice -
                Math.max(0, order.quantity - 500) * order.itemPrice * 0.05 +
                Math.min(order.quantity * order.itemPrice * 0.1, 100.0)
    }

    fun getMarried(user: User) {
        /**
         * ...other code...
         */

        if (user.gender == Gender.MALE && user.age >= 22 || user.gender == Gender.FEMALE && user.age >= 20) {
            /**
             * 登记结婚
             */
        }

    }

}
