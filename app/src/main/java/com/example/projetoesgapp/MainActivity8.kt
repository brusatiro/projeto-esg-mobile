package com.example.projetoesgapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main8)

        val btnCadastrar = findViewById<Button>(R.id.btnCadastrar)

        btnCadastrar.setOnClickListener{
            val i = Intent (this, MainActivity3::class.java)
            startActivity(i)
        }

        val btnFazerCadastro = findViewById<TextView>(R.id.btnFazerCadastro)

        btnFazerCadastro.setOnClickListener{
            val i = Intent (this, MainActivity2::class.java)
            startActivity(i)
        }
    }
}
