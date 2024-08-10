package com.example.e_commerceapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.fragment.app.Fragment
import com.example.e_commerceapp.databinding.FragmentCortBinding


class CortFragment :Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
     val binding  = FragmentCortBinding.inflate(
            inflater, container, false
        )
        return binding.root
    }
}