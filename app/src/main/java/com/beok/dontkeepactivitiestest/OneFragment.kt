package com.beok.dontkeepactivitiestest

import android.os.Bundle
import android.util.Log
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

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("beokbeok", "onDestroyView: One")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("beokbeok", "onDestroy: One")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("beokbeok", "onDetach: One")
    }

    companion object {
        val TAG = OneFragment::class.java.simpleName.toString()
    }
}
