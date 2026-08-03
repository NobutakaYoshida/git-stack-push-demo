package org.example

data class User(
    val id: Int,
    val name: String,
    val email: String
) {
    fun getDisplayName(): String = "MEMBER: $name"
}
