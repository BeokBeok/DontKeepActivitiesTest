package com.beok.dontkeepactivitiestest

import android.os.Bundle
import android.util.Log
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

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("beokbeok", "onDestroyView: Four")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("beokbeok", "onDestroy: Four")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("beokbeok", "onDetach: Four")
    }

    companion object {
        val TAG = FourFragment::class.java.simpleName.toString()
    }
}
