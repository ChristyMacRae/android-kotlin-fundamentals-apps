package com.example.android.androidinterview.secondscreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.android.androidinterview.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private val viewModel: SecondViewModel by lazy {
        ViewModelProvider(this).get(SecondViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = FragmentSecondBinding.inflate(inflater)

        binding.setLifecycleOwner(this)
        binding.viewModel = viewModel

        return binding.root
    }
}