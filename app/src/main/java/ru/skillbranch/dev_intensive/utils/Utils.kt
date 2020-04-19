package ru.skillbranch.dev_intensive.utils

import android.service.voice.AlwaysOnHotwordDetector

object Utils {

    fun parsFullName(fullName: String?): Pair<String?, String?> {
        val parts: List<String>? = fullName?.split(" ")
        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)

//        return Pair(firstName, lastName)
        return firstName to lastName
    }

    fun transliteration(payload: String, devider: String = " "): String {
        return "Ruslan Abiev"
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        return "${firstName?.take(1)?.toUpperCase()}. ${lastName?.take(1)?.toUpperCase()}. "
    }

}