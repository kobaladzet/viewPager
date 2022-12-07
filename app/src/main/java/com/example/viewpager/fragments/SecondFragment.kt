package com.example.viewpager.fragments

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.viewpager.R
import com.example.viewpager.databinding.FragmentSecondBinding

class SecondFragment: Fragment(R.layout.fragment_second) {
    private lateinit var binding: FragmentSecondBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSecondBinding.bind(view)

        val like = binding.like
        val dislike = binding.dislike
        val favorite = binding.favorite

        like.setOnClickListener() {
            Toast.makeText(activity,"you liked that video",Toast.LENGTH_SHORT).show()
        }
        dislike.setOnClickListener() {
            Toast.makeText(activity,"you made a wrong decision!",Toast.LENGTH_SHORT).show()
        }
        favorite.setOnClickListener() {
            Toast.makeText(activity,"you have a good taste in music",Toast.LENGTH_SHORT).show()
        }


    }
}