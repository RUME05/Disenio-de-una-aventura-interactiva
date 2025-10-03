// src/main/java/com/ejemplo/animalkingdomapp/MixedFragment.kt
package com.example.tarea2

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button



class MixedFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_mixed, container, false)
        val exploreButton: Button = view.findViewById(R.id.btn_explore_mixed) // Asegúrate que el ID sea correcto en tu XML

        exploreButton.setOnClickListener {
            val intent = Intent(activity, HabitatActivity::class.java)
            // Enviamos "MIXED"
            intent.putExtra("ECOSYSTEM_TYPE", "MIXED")
            startActivity(intent)
            activity?.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
        return view
    }
}