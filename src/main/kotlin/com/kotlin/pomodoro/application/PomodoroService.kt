package com.kotlin.pomodoro.application

import com.kotlin.pomodoro.domain.session.PomodoroSession
import com.kotlin.pomodoro.persistence.exposed.session.PomodoroSessions
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.transactions.transaction
import org.springframework.stereotype.Service

@Service
class PomodoroService(
    private val database: Database
) {
    fun recordSession(session: PomodoroSession) {
        transaction(database) {
            PomodoroSessions.insert {
                it[userId] = session.userId.value
                it[topic] = session.topic
                it[type] = session.type.name
                it[startTime] = session.startTime
                it[endTime] = session.endTime
            }
        }
    }
}