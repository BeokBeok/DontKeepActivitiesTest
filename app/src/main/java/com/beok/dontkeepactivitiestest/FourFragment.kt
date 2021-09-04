package com.beok.dontkeepactivitiestest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.beok.dontkeepactivitiestest.databinding.FragmentFourBinding

class FourFragment : Fragment() {

    private lateinit var binding: FragmentFourBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFourBinding.inflate(layoutInflater)
        return binding.root
    }

    companion object {
        val TAG = FourFragment::class.java.simpleName.toString()
    }
}
