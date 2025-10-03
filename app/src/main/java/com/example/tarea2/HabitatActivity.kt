// src/main/java/com/ejemplo/animalkingdomapp/HabitatActivity.kt
package com.example.tarea2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.tarea2.R

class HabitatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        ThemeManager.applyTheme(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_habitat)

        val layout: ConstraintLayout = findViewById(R.id.habitat_layout)
        val buttonsContainer: LinearLayout = findViewById(R.id.habitat_buttons_container)

        // Recuperar el tipo de ecosistema
        val ecosystemType = intent.getStringExtra("ECOSYSTEM_TYPE")

// En HabitatActivity.kt, dentro de onCreate
        val habitats: List<String>

        when (ecosystemType) {
            "TERRESTRIAL" -> {
                layout.setBackgroundResource(R.drawable.bg_forest)
                habitats = listOf("Bosques", "Selvas", "Desiertos", "Praderas", "Sabanas")
            }
            "AQUATIC" -> {
                layout.setBackgroundResource(R.drawable.bg_ocean)
                habitats = listOf("Mares", "Océanos", "Ríos", "Lagos")
            }
            "MIXED" -> {
                layout.setBackgroundResource(R.drawable.bg_mixed)
                habitats = listOf("Costas", "Humedales")
            }
            else -> {
                // Un caso por defecto por si algo falla
                habitats = listOf()
            }
        }

        // Crear botones para cada hábitat (versión simple sin RecyclerView)
        for (habitat in habitats) {
            val button = Button(this)
            button.text = habitat
            button.setOnClickListener {
                // Punto de interés: Mostrar un Toast antes de navegar
                Toast.makeText(this, "Explorando $habitat...", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, AnimalActivity::class.java)
                intent.putExtra("HABITAT_TYPE", habitat)
                startActivity(intent)
            }
            buttonsContainer.addView(button)
        }
    }
}