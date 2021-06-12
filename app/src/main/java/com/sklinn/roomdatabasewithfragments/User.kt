package com.sklinn.roomdatabasewithfragments

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class User(

    @PrimaryKey(autoGenerate = true)
    val id: Long,

    val firstName: String,

    val lastName: String,

    val age: Int
)