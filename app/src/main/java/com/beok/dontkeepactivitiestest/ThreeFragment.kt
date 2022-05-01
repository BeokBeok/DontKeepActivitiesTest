package com.beok.dontkeepactivitiestest

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.beok.dontkeepactivitiestest.databinding.FragmentThreeBinding

/**
 * 라이트 | 다크모드 테스트
 */
class ThreeFragment : Fragment() {

    private lateinit var binding: FragmentThreeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThreeBinding.inflate(layoutInflater)
        binding.btnLight.setOnClickListener {
            ThemeUtil.applyTheme(ThemeType.LIGHT_MODE)
        }
        binding.btnDark.setOnClickListener {
            ThemeUtil.applyTheme(ThemeType.DARK_MODE)
        }
        return binding.root
    }

    override fun onPause() {
        super.onPause()
        Log.d("beokbeok", "onPause: Three")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("beokbeok", "onSaveInstanceState: Three")
    }

    override fun onStop() {
        super.onStop()
        Log.d("beokbeok", "onStop: Three")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("beokbeok", "onDestroyView: Three")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("beokbeok", "onDestroy: Three")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("beokbeok", "onDetach: Three")
    }

    companion object {
        val TAG = ThreeFragment::class.java.simpleName.toString()
    }
}
