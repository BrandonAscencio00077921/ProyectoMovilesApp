package com.pytheach.application.ui.lesson.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pytheach.application.data.model.LessonModel
import com.pytheach.application.databinding.LessonItemBinding

class LessonRecyclerViewAdapter(
    private val clickListener: (LessonModel) -> Unit
) : RecyclerView.Adapter<LessonRecyclerViewHolder>() {
    private val lessons = ArrayList<LessonModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonRecyclerViewHolder {
        val binding = LessonItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LessonRecyclerViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return lessons.size
    }

    override fun onBindViewHolder(holder: LessonRecyclerViewHolder, position: Int) {
        val lesson = lessons[position]
        holder.bind(lesson, clickListener)
    }

    fun setData(lessonsList: List<LessonModel>){
        lessons.addAll(lessonsList)
    }
}

