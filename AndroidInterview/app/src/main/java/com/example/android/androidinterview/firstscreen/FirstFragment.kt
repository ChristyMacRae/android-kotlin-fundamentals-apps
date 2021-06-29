package com.example.android.androidinterview.firstscreen

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.android.androidinterview.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private val viewModel: FirstViewModel by lazy {
        ViewModelProvider(this).get(FirstViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = FragmentFirstBinding.inflate(inflater)

        binding.setLifecycleOwner(this)
        binding.viewModel = viewModel

        return binding.root
    }

}