package com.kotlin.pomodoro.domain.user

data class TimeSetting(
    val workTime: Int,
    val shortRestTime: Int,
    val longRestTime: Int
) {
    init {
        require(workTime > 0) { "workTime must be greater than 0" }
        require(shortRestTime > 0) { "shortRestTime must be greater than 0" }
        require(longRestTime > 0) { "longRestTime must be greater than 0" }
    }
}
