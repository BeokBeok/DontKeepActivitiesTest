package com.beok.dontkeepactivitiestest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.beok.dontkeepactivitiestest.databinding.FragmentTwoBinding

class TwoFragment : Fragment() {

    private lateinit var binding: FragmentTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTwoBinding.inflate(layoutInflater)
        return binding.root
    }

    companion object {
        val TAG = TwoFragment::class.java.simpleName.toString()
    }
}
