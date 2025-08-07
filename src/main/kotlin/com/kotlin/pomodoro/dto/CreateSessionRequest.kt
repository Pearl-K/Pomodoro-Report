package com.kotlin.pomodoro.dto

import com.kotlin.pomodoro.domain.session.SessionType
import java.time.LocalDateTime

data class CreateSessionRequest(
    val sessionId: Long,
    val userId: Long,
    val topic: String,
    val type: SessionType,
    val startTime: LocalDateTime,
    val endTime: LocalDateTime
)
