package com.example.tarea2

import android.content.Context
import android.content.SharedPreferences

object ThemeManager {
    private const val PREFS_NAME = "ThemePrefs"
    private const val IS_DARK_MODE_ENABLED = "isDarkModeEnabled"

    // Obtiene las SharedPreferences
    private fun getPrefs(context: Context): SharedPreferences {
        return context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    }

    // Guarda la preferencia del tema
    fun setDarkMode(context: Context, isEnabled: Boolean) {
        getPrefs(context).edit().putBoolean(IS_DARK_MODE_ENABLED, isEnabled).apply()
    }

    // Carga y aplica el tema
    fun applyTheme(context: Context) {
        val isDarkMode = getPrefs(context).getBoolean(IS_DARK_MODE_ENABLED, false) // Falso = Modo Claro por defecto
        if (isDarkMode) {
            context.setTheme(R.style.Theme_App_Dark)
        } else {
            context.setTheme(R.style.Theme_App_Light)
        }
    }
}