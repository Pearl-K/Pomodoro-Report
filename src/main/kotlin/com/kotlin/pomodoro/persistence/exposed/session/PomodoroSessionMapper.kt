package com.kotlin.pomodoro.persistence.exposed.session

import com.kotlin.pomodoro.domain.PomodoroSessionId
import com.kotlin.pomodoro.domain.UserId
import com.kotlin.pomodoro.domain.session.PomodoroSession
import com.kotlin.pomodoro.domain.session.SessionType
import org.jetbrains.exposed.sql.ResultRow

fun ResultRow.toPomodoroSession(): PomodoroSession = PomodoroSession(
    id = PomodoroSessionId(this[PomodoroSessions.id].value),
    userId = UserId(this[PomodoroSessions.userId]),
    topic = this[PomodoroSessions.topic],
    type = SessionType.valueOf(this[PomodoroSessions.type]),
    startTime = this[PomodoroSessions.startTime],
    endTime = this[PomodoroSessions.endTime]
)