package com.pytheach.application.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "lesson_table")
data class LessonModel(
    @PrimaryKey(autoGenerate = true) val lessonId: Int,
    @ColumnInfo(name = "numberLesson") val numberlesson: String
)
{
    constructor(numberlesson: String):
            this(0, numberlesson)
}
