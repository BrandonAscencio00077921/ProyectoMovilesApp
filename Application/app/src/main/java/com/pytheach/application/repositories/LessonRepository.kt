package com.pytheach.application.repositories

import com.pytheach.application.data.dao.LessonDao
import com.pytheach.application.data.lessons
import com.pytheach.application.data.model.LessonModel

class LessonRepository(private val lessonDao: LessonDao) {
    suspend fun getAllLessons() = lessons
}