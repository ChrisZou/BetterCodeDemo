package com.chriszou.bettercodedemo.collectionapi

import com.chriszou.bettercodedemo.refactor.Gender
import com.chriszou.bettercodedemo.refactor.User
import java.util.UUID

object UserManager {
    fun currentUser() = User(UUID.randomUUID().toString(), "chriszou", 18, Gender.MALE)
}