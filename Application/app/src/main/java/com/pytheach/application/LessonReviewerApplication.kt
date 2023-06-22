package com.pytheach.application

import android.app.Application
import com.pytheach.application.data.lessons
import com.pytheach.application.repositories.LessonRepository

class LessonReviewerApplication: Application() {

    val lessonRepository: LessonRepository by lazy{
        LessonRepository(lessons)
    }
}