// src/main/java/com/ejemplo/animalkingdomapp/MainActivity.kt
package com.example.tarea2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.tarea2.AquaticFragment
import com.example.tarea2.MixedFragment
import com.example.tarea2.R
import com.example.tarea2.TerrestrialFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.switchmaterial.SwitchMaterial


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        ThemeManager.applyTheme(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // --- Lógica del Switch ---
        val themeSwitch: SwitchMaterial = findViewById(R.id.theme_switch)

        // Cargar el estado actual para poner el switch en la posición correcta
        val prefs = getSharedPreferences("ThemePrefs", MODE_PRIVATE)
        themeSwitch.isChecked = prefs.getBoolean("isDarkModeEnabled", false)

        themeSwitch.setOnCheckedChangeListener { _, isChecked ->
            // Guardar la preferencia
            ThemeManager.setDarkMode(this, isChecked)

            // Reiniciar la actividad para aplicar el tema instantáneamente
            recreate()
        }

        val bottomNav: BottomNavigationView = findViewById(R.id.bottom_navigation)

        // Cargar el fragment inicial
        replaceFragment(TerrestrialFragment())

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_terrestrial -> {
                    replaceFragment(TerrestrialFragment())
                    true
                }

                R.id.nav_aquatic -> {
                    replaceFragment(AquaticFragment())
                    true
                }

                R.id.nav_mixed -> {
                    replaceFragment(MixedFragment())
                    true
                }

                else -> false
            }
        }
    }

    // Función para reemplazar fragments con una animación de fundido
// Dentro de MainActivity.kt
    private fun replaceFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        // ¡Usando nuestras animaciones!
        transaction.setCustomAnimations(R.anim.fade_in, R.anim.fade_out)
        transaction.replace(R.id.fragment_container, fragment)
        transaction.commit()
    }

}