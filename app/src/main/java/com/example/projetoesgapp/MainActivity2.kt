package com.example.projetoesgapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main2)

        val btnEntrar = findViewById<Button>(R.id.btnEntrar)

        btnEntrar.setOnClickListener{
            val i = Intent (this, MainActivity3::class.java)
            startActivity(i)
        }

        val btnFazerCadastro = findViewById<TextView>(R.id.btnFazerCadastro)

        btnFazerCadastro.setOnClickListener{
            val i = Intent (this, MainActivity8::class.java)
            startActivity(i)
        }

        val btnEsqueceuSenha = findViewById<TextView>(R.id.btnEsqueceuSenha)

        btnEsqueceuSenha.setOnClickListener{
            val i = Intent (this, MainActivity6::class.java)
            startActivity(i)
        }
    }
}
