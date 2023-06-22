package com.pytheach.application.ui

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.pytheach.application.R
import com.pytheach.application.databinding.FragmentSingInBinding


class SingInFragment : Fragment() {

    private lateinit var binding: FragmentSingInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSingInBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.startButton.setOnClickListener {
            it.findNavController().navigate(R.id.action_singInFragment_to_lessonFragment5)
        }
        binding.singUpButton.setOnClickListener {
            it.findNavController().navigate(R.id.action_singInFragment_to_singUpFragment)
        }
    }

}