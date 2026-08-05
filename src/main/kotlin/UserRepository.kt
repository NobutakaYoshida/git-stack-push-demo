package org.example

class UserRepository {
    private val users = mutableListOf<User>()
    fun save(user: User) { users.add(user) }
}