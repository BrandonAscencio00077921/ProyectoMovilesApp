package com.pytheach.application.ui.lesson.viewmodel

import android.text.Spannable.Factory
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.pytheach.application.LessonReviewerApplication
import com.pytheach.application.data.model.LessonModel
import com.pytheach.application.repositories.LessonRepository

class LessonViewModel (private val repository: LessonRepository) : ViewModel(){
    var lessonId = MutableLiveData(0)
    var numberLesson = MutableLiveData("")

    suspend fun getAllLessons() = repository.getAllLessons()

    fun setSelectedLesson(lesson: LessonModel) {
        lessonId.value = lesson.lessonId
        numberLesson.value = lesson.numberlesson
    }

    companion object{
        val Factory = viewModelFactory {
            initializer {
                val app = this[APPLICATION_KEY] as LessonReviewerApplication
                LessonViewModel(app.lessonRepository)
            }
        }
    }

}