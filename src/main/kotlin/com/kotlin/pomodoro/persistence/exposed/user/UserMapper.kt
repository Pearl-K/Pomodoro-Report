package com.kotlin.pomodoro.persistence.exposed.user

import com.kotlin.pomodoro.domain.UserId
import com.kotlin.pomodoro.domain.user.TimeSetting
import com.kotlin.pomodoro.domain.user.User
import org.jetbrains.exposed.sql.ResultRow

fun ResultRow.toUser(): User = User(
    id = UserId(this[Users.id].value),
    email = this[Users.email],
    nickname = this[Users.nickname],
    timeSetting = TimeSetting(
        this[Users.workTime],
        this[Users.shortRestTime],
        this[Users.longRestTime]
    )
)