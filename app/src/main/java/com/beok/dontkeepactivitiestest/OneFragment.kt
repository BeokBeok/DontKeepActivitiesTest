package com.beok.dontkeepactivitiestest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.beok.dontkeepactivitiestest.databinding.FragmentOneBinding

class OneFragment : Fragment() {

    private lateinit var binding: FragmentOneBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOneBinding.inflate(layoutInflater)
        return binding.root
    }

    companion object {
        val TAG = OneFragment::class.java.simpleName.toString()
    }
}
