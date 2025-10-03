
package com.example.tarea2

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button



class TerrestrialFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar el layout para este fragment
        val view = inflater.inflate(R.layout.fragment_terrestrial, container, false)

        val exploreButton: Button = view.findViewById(R.id.btn_explore_terrestrial)
        exploreButton.setOnClickListener {
            // Crear un Intent para abrir HabitatActivity
            val intent = Intent(activity, HabitatActivity::class.java)

            // Añadir información extra para que la siguiente Activity sepa qué mostrar
            intent.putExtra("ECOSYSTEM_TYPE", "TERRESTRIAL")

            // Iniciar la Activity
            startActivity(intent)

            // Dentro del setOnClickListener del botón
            activity?.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        return view
    }
}