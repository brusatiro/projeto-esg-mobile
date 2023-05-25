package com.example.projetoesgapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main7)

        val btnDicas = findViewById<Button>(R.id.btnDicas)

        btnDicas.setOnClickListener{
            val i = Intent (this, MainActivity4::class.java)
            startActivity(i)
        }

        val btnDicasIcon = findViewById<ImageButton>(R.id.btnDicasIcon)

        btnDicasIcon.setOnClickListener{
            val i = Intent (this, MainActivity4::class.java)
            startActivity(i)
        }

        val btnInicio = findViewById<Button>(R.id.btnInicio)

        btnInicio.setOnClickListener{
            val i = Intent (this, MainActivity3::class.java)
            startActivity(i)
        }

        val btnInicioIcon = findViewById<ImageButton>(R.id.btnInicioIcon)

        btnInicioIcon.setOnClickListener{
            val i = Intent (this, MainActivity3::class.java)
            startActivity(i)
        }

        val btnBonificacao = findViewById<Button>(R.id.btnBonificacao)

        btnBonificacao.setOnClickListener{
            val i = Intent (this, MainActivity9::class.java)
            startActivity(i)
        }

        val btnPremiosIcon = findViewById<ImageButton>(R.id.btnPremiosIcon)

        btnPremiosIcon.setOnClickListener{
            val i = Intent (this, MainActivity9::class.java)
            startActivity(i)
        }

    }
}