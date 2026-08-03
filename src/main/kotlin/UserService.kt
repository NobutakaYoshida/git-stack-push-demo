package org.example

class UserService(private val userRepository: UserRepository) {

    fun registerUser(id: Int, name: String, email: String) {
        // Step 1の User を利用
        val newUser = User(id, name, email)

        // Step 2の UserRepository を利用
        userRepository.save(newUser)

        println("Registration complete for $name")
    }
}