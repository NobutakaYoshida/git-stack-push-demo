package org.example

class UserRepository {
    // 簡易的なオンメモリDB
    private val users = mutableListOf<User>()

    fun save(user: User) {
        users.add(user)
        println("User saved: ${user.name}")
    }

    fun findById(id: Int): User? {
        return users.find { it.id == id }
    }
}