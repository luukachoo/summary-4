package com.example.summary_4.screens.fragments

import androidx.fragment.app.viewModels
import com.example.summary_4.base.BaseFragment
import com.example.summary_4.databinding.FragmentMainBinding
import com.example.summary_4.model.MainViewModel


class MainFragment : BaseFragment<FragmentMainBinding>(FragmentMainBinding::inflate) {

    private val viewModel: MainViewModel by viewModels()

    override fun init() {
        TODO("Not yet implemented")
    }

    override fun listeners() {
        TODO("Not yet implemented")
    }
}