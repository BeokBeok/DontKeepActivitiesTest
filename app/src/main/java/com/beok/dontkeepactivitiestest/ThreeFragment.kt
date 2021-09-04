package com.beok.dontkeepactivitiestest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.beok.dontkeepactivitiestest.databinding.FragmentThreeBinding

class ThreeFragment : Fragment() {

    private lateinit var binding: FragmentThreeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThreeBinding.inflate(layoutInflater)
        return binding.root
    }

    companion object {
        val TAG = ThreeFragment::class.java.simpleName.toString()
    }
}
