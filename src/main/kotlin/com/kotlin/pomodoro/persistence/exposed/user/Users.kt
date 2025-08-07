package com.kotlin.pomodoro.persistence.exposed.user

import org.jetbrains.exposed.dao.id.LongIdTable


object Users : LongIdTable("users") {
    val email = varchar("email", 255)
    val nickname = varchar("nickname", 100)
    val workTime = integer("work_time")
    val shortRestTime = integer("short_rest_time")
    val longRestTime = integer("long_rest_time")
}