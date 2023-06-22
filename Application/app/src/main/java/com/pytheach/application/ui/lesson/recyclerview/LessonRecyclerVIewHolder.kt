package com.pytheach.application.ui.lesson.recyclerview

import androidx.recyclerview.widget.RecyclerView
import com.pytheach.application.data.model.LessonModel
import com.pytheach.application.databinding.LessonItemBinding

class LessonRecyclerViewHolder(private val binding: LessonItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(lesson: LessonModel, clickListener: (LessonModel) -> Unit){
        binding.lessonText.text = lesson.numberlesson
        binding.lessonCard.setOnClickListener{
            clickListener(lesson)
        }
    }
}