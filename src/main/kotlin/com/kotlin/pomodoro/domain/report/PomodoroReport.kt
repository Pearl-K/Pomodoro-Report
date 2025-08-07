package com.kotlin.pomodoro.domain.report

import com.kotlin.pomodoro.domain.UserId
import java.time.LocalDate
import java.time.LocalDateTime

data class PomodoroReport(
    val reportDate: LocalDate,
    val userId: UserId,
    val type: ReportType,
    val startTime: LocalDateTime,
    val endTime: LocalDateTime,
    val content: String
)
