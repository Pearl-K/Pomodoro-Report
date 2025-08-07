package com.kotlin.pomodoro.domain.user

import com.kotlin.pomodoro.domain.UserId

data class User(
    val id: UserId,
    var email: String,
    var nickname: String,
    var timeSetting: TimeSetting,
)
