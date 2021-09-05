package com.beok.dontkeepactivitiestest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.beok.dontkeepactivitiestest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val oneFragment = OneFragment()
    private val twoFragment = TwoFragment()
    private val threeFragment = ThreeFragment()
    private val fourFragment = FourFragment()

    private var currentFragment: Fragment = oneFragment
    private var selectId: Int = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("beokbeok", "onCreate")

        Log.d("beokbeok", "MainActivity is $this")
        Log.d("beokbeok", "oneFragment is $oneFragment")
        Log.d("beokbeok", "twoFragment is $twoFragment")
        Log.d("beokbeok", "threeFragment is $threeFragment")
        Log.d("beokbeok", "fourFragment is $fourFragment")

        setupBinding()
        removeAllFragmentIfPossible(savedInstanceState)
        setupUI()
        selectTab(selectId)
        setupListener()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("beokbeok", "onRestoreInstanceState")
    }

    override fun onResume() {
        super.onResume()
        Log.d("beokbeok", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("beokbeok", "onPause")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("beokbeok", "onSaveInstanceState")
        outState.putInt("selectId", binding.bnvMain.selectedItemId)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("beokbeok", "onDestroy")
    }

    private fun selectTab(itemId: Int) {
        when (itemId) {
            R.id.item_bottom_navigation_one -> showFragment(oneFragment)
            R.id.item_bottom_navigation_two -> showFragment(twoFragment)
            R.id.item_bottom_navigation_three -> showFragment(threeFragment)
            R.id.item_bottom_navigation_four -> showFragment(fourFragment)
        }
    }

    private fun removeAllFragmentIfPossible(savedInstanceState: Bundle?) {
        if (savedInstanceState != null) {
            supportFragmentManager.fragments.forEach {
                supportFragmentManager
                    .beginTransaction()
                    .remove(it)
                    .commitNow()
            }
            selectId = savedInstanceState.getInt("selectId")
        }
    }

    private fun setupListener() {
        binding.bnvMain.setOnItemSelectedListener {
            selectTab(it.itemId)
            true
        }
    }

    private fun showFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .hide(currentFragment)
            .show(fragment)
            .commitAllowingStateLoss()
        currentFragment = fragment
    }

    private fun setupUI() {
        supportFragmentManager
            .beginTransaction()
            .run {
                if (supportFragmentManager.findFragmentByTag(FourFragment.TAG) == null) {
                    add(R.id.fl_main, fourFragment, FourFragment.TAG)
                    hide(fourFragment)
                }
                if (supportFragmentManager.findFragmentByTag(ThreeFragment.TAG) == null) {
                    add(R.id.fl_main, threeFragment, ThreeFragment.TAG)
                    hide(threeFragment)
                }
                if (supportFragmentManager.findFragmentByTag(TwoFragment.TAG) == null) {
                    add(R.id.fl_main, twoFragment, TwoFragment.TAG)
                    hide(twoFragment)
                }
                if (supportFragmentManager.findFragmentByTag(OneFragment.TAG) == null) {
                    add(R.id.fl_main, oneFragment, OneFragment.TAG)
                }
                commit()
            }
    }

    private fun setupBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
