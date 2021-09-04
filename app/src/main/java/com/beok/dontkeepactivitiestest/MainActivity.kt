package com.beok.dontkeepactivitiestest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.beok.dontkeepactivitiestest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val oneFragment = OneFragment()
    private val twoFragment = TwoFragment()
    private val threeFragment = ThreeFragment()
    private val fourFragment = FourFragment()

    private var currentFragment: Fragment = oneFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupBinding()
        setupUI()
        setupListener()
    }

    private fun setupListener() {
        binding.bnvMain.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.item_bottom_navigation_one -> showFragment(oneFragment)
                R.id.item_bottom_navigation_two -> showFragment(twoFragment)
                R.id.item_bottom_navigation_three -> showFragment(threeFragment)
                R.id.item_bottom_navigation_four -> showFragment(fourFragment)
            }
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
                commitAllowingStateLoss()
            }
    }

    private fun setupBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
