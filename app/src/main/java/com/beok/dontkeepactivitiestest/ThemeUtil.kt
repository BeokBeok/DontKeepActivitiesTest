package com.beok.dontkeepactivitiestest

import android.os.Build
import androidx.appcompat.app.AppCompatDelegate

object ThemeUtil {
    fun applyTheme(themeType: ThemeType) {
        when (themeType) {
            ThemeType.LIGHT_MODE -> {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
            ThemeType.DARK_MODE -> {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }
            ThemeType.SYSTEM_MODE -> {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
                } else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO_BATTERY)
                }
            }
        }
    }

    fun isNightMode(): Boolean =
        AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES
}

enum class ThemeType {
    LIGHT_MODE,
    DARK_MODE,
    SYSTEM_MODE
}