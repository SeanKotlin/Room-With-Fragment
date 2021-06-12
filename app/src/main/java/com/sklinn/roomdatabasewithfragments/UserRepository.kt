package com.sklinn.roomdatabasewithfragments

class UserRepository(
    private val userDao: UserDao
) {
    val readAllData = userDao.readAllData()

    suspend fun addUser(user: User){
        userDao.addUser(user)
    }
}