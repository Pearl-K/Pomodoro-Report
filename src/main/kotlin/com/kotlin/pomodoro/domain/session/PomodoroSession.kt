package com.kotlin.pomodoro.domain.session

import com.kotlin.pomodoro.domain.PomodoroSessionId
import com.kotlin.pomodoro.domain.UserId
import java.time.Duration
import java.time.LocalDateTime

data class PomodoroSession(
    val id: PomodoroSessionId,
    val userId: UserId,
    val topic: String,
    val type: SessionType,
    val startTime: LocalDateTime,
    val endTime: LocalDateTime
) {
    init {
        require(endTime.isAfter(startTime)) { "endTime must be after startTime" }
    }

    val durationMinutes: Long
        get() = Duration.between(startTime, endTime).toMinutes()
}
