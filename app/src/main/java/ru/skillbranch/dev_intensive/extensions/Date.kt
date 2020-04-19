package ru.skillbranch.dev_intensive.extensions

import java.text.SimpleDateFormat
import java.util.*

//const val SECOND = 1000L
//const val MINUTE = 60 * SECOND
//const val HOUR = 60 * MINUTE
//const val DAY = 24 * HOUR

fun Date.format(pattern: String = "HH:mm:ss dd:MM:yy"): String {
    val dateFormat = SimpleDateFormat(pattern, Locale("ru"))
    return dateFormat.format(this)
}

fun Date.add(value: Int, units: TimeUnits = TimeUnits.SECOND): Date {
    var time = this.time

    time += when (units) {
        TimeUnits.SECOND -> value * TimeUnits.SECOND.coefficient
        TimeUnits.MINUTE -> value * TimeUnits.MINUTE.coefficient
        TimeUnits.HOUR -> value * TimeUnits.HOUR.coefficient
        TimeUnits.DAY -> value * TimeUnits.DAY.coefficient
    }

    this.time = time

    return this
}

fun Date.humanizeDiff(date: Date = Date()): String {
    return "не реализовано"
}

enum class TimeUnits(val coefficient: Long) {
    SECOND(1000L),
    MINUTE(60 * SECOND.coefficient),
    HOUR(60 * MINUTE.coefficient),
    DAY(24 * HOUR.coefficient)
}