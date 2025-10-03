// src/main/java/com/ejemplo/animalkingdomapp/AquaticFragment.kt
package com.example.tarea2

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button



class AquaticFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_aquatic, container, false)
        val exploreButton: Button = view.findViewById(R.id.btn_explore_aquatic) // Asegúrate que el ID sea correcto en tu XML

        exploreButton.setOnClickListener {
            val intent = Intent(activity, HabitatActivity::class.java)
            // La única diferencia clave: enviamos "AQUATIC"
            intent.putExtra("ECOSYSTEM_TYPE", "AQUATIC")
            startActivity(intent)
            activity?.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
        return view
    }
}