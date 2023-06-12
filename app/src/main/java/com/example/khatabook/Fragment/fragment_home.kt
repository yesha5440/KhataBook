package com.example.khatabook.Fragment

import android.R.attr.fromDegrees
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.RotateAnimation
import androidx.fragment.app.Fragment
import com.example.khatabook.R
import com.example.khatabook.databinding.FragmentHomeBinding



class fragment_home : Fragment() {

    lateinit var binding : FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)


        val anim = RotateAnimation(0f, 90f)


        return binding.root
    }

}