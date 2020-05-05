package ru.skillbranch.devintensive.models

data class Profile(
    val firstName: String,
    val lastName: String,
    val about: String,
    val repository: String,
    val rating: Int = 0,
    val respect: Int = 0
) {

    val nickName = "John Doe"
    val rank: String = "Junior Android Developer"

    fun toMap(): Map<String, Any> = mapOf(
        "nickName" to nickName,
        "rank" to rank,
        "rating" to rating,
        "respect" to respect,
        "about" to about,
        "firstName" to firstName,
        "lastName" to lastName,
        "repository" to repository
    )

}