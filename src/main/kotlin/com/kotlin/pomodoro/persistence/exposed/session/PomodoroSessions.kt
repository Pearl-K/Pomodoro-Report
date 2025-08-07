package com.kotlin.pomodoro.persistence.exposed.session

import com.kotlin.pomodoro.persistence.exposed.user.Users
import org.jetbrains.exposed.dao.id.LongIdTable
import org.jetbrains.exposed.sql.javatime.datetime

object PomodoroSessions : LongIdTable("pomodoro_sessions") {
    val userId = long("user_id")
    val topic = varchar("topic", 100)
    val type = varchar("type", 20)
    val startTime = datetime("start_time")
    val endTime = datetime("end_time")
}