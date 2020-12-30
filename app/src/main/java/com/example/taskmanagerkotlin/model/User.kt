package com.example.taskmanagerkotlin.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "userTable")

data class User(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "userId")
    var userId: Long = 0,

    @ColumnInfo(name = "uuid")
    var id: UUID = UUID.randomUUID(),

    @ColumnInfo(name = "userName")
    var userName: String = "",

    @ColumnInfo(name = "passWord")
    var password: String = ""
)
