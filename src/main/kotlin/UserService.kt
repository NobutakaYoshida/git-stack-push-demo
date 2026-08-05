package org.example

class UserService(private val repo: UserRepository) {
    fun register(id: Int, name: String) {
        repo.save(User(id, name))
    }
}