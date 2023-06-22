package com.pytheach.application.ui.lesson

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.pytheach.application.R
import com.pytheach.application.data.model.LessonModel
import com.pytheach.application.databinding.FragmentLessonBinding
import com.pytheach.application.ui.lesson.recyclerview.LessonRecyclerViewAdapter
import com.pytheach.application.ui.lesson.viewmodel.LessonViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class LessonFragment : Fragment() {

    private val lessonViewModel: LessonViewModel by activityViewModels {
        LessonViewModel.Factory
    }
    private lateinit var adapter: LessonRecyclerViewAdapter

    private lateinit var binding: FragmentLessonBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLessonBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        CoroutineScope(Dispatchers.Main).launch {
            setRecyclerView(view)
        }
    }

    private suspend fun setRecyclerView(view: View) {
        binding.recyclerView.layoutManager = LinearLayoutManager(view.context)

        adapter = LessonRecyclerViewAdapter { selectedLesson ->
            showSelectedItem(selectedLesson)
        }

        binding.recyclerView.adapter = adapter
        displayLessons()
    }

    private suspend fun displayLessons() {
        adapter.setData(lessonViewModel.getAllLessons())
        adapter.notifyDataSetChanged()
    }

    private fun showSelectedItem(lesson: LessonModel) {
        lessonViewModel.setSelectedLesson(lesson)
    }
}