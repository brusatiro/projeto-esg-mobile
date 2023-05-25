package com.example.projetoesgapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity() {

    private val places = arrayListOf(
        Place("Ecoponto Jardim Maria do Carmo", LatLng(-23.5965994,-46.7529815), "R. Caminho do Engenho, 800 - Ferreira, São Paulo - SP, 05524-000"),
        Place("Ecoponto Bandeirantes", LatLng(-23.4862880, -46.6951634), "R. Itaiquara, 237 - Parque Monteiro Soares"),
        Place("Ecoponto Tereza Cristina", LatLng(-23.5691189,-46.6105852), "Rua Tereza Cristina, nº 10 X Av. do Estado"),
        Place("Ecoponto Itaim Paulista", LatLng(-23.5045774,-46.3749025), "Rua Barão de Almeida Galeão, nº58"),
        Place("Ecoponto Corinthians", LatLng(-23.5477054,-46.4389728), "Rua Ana Perena Nº 155 (Distrito José Bonifácio)"),
        Place("Ecoponto Jabaquara", LatLng(-23.6537048,-46.6527311), "Rua Genaro de Carvalho x Rua Jupatis"),
        Place("Ecoponto Vila Jaragua", LatLng(-23.5164776,-46.7442295), "Rua Agrestina X Av. Marginal Direita do Tietê"),
        Place("Ecoponto Tatuapé", LatLng(-23.5299145,-46.5852123), "Av. Salim Farah Maluf, n°179"),
        Place("Ecoponto Bras", LatLng(-23.5570721,-46.7127192), "Rua Palmorino Mônaco x Rua da Moóca"),
        Place("Ecoponto Berrini", LatLng(-23.6250818,-46.7195716), "Praça. do Cancioneiro, nº 15"),
        Place("Ecoponto Mooca", LatLng(-23.5479585,-46.6050114), "Av. Pires do Rio X Rua Bresser"),
        Place("Ecoponto Alto de Pinheiros", LatLng(-23.5570721,-46.7127192), "Praça Arcipreste Anselmo de Oliveira"),
        Place("Ecoponto Tucuruvi", LatLng(-23.4672646,-46.6121335), "Rua Eduardo Vicente Nasser n. 519"),
        Place("Ecoponto Liberdade", LatLng(-23.5565917,-46.6392435), "Rua Jaceguai, Nº 67 x Av. Liberdade"),
        Place("Ecoponto Barrafunda", LatLng(-23.5271629,-46.6507547), "Rua Sólon")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_maps)

        val btnDicas = findViewById<Button>(R.id.btnDicas)
        val btnDicasIcon = findViewById<ImageButton>(R.id.btnDicasIcon)
        val btnBonificacao = findViewById<Button>(R.id.btnBonificacao)
        val btnPremiosIcon = findViewById<ImageButton>(R.id.btnPremiosIcon)
        val btnInicio = findViewById<Button>(R.id.btnInicio)
        val btnInicioIcon = findViewById<ImageButton>(R.id.btnInicioIcon)
        val btnPontuacao = findViewById<Button>(R.id.btnPontuacao)
        val btnPontuacaoIcon = findViewById<ImageButton>(R.id.btnPontuacaoIcon)


        btnDicas.setOnClickListener{
            val i = Intent (this, MainActivity4::class.java)
            startActivity(i)
        }

        btnDicasIcon.setOnClickListener{
            val i = Intent (this, MainActivity4::class.java)
            startActivity(i)
        }
        btnBonificacao.setOnClickListener{
            val i = Intent (this, MainActivity9::class.java)
            startActivity(i)
        }
        btnPremiosIcon.setOnClickListener{
            val i = Intent (this, MainActivity9::class.java)
            startActivity(i)
        }

        btnInicio.setOnClickListener{
            val i = Intent (this, MainActivity3::class.java)
            startActivity(i)
        }

        btnInicioIcon.setOnClickListener{
            val i = Intent (this, MainActivity3::class.java)
            startActivity(i)
        }

        btnPontuacao.setOnClickListener{
            val i = Intent (this, MainActivity7::class.java)
            startActivity(i)
        }

        btnPontuacaoIcon.setOnClickListener{
            val i = Intent (this, MainActivity7::class.java)
            startActivity(i)
        }

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map_fragment) as SupportMapFragment
        mapFragment.getMapAsync { googleMap -> addMarkers(googleMap)
            googleMap.setOnMapLoadedCallback {
                val bounds = LatLngBounds.builder()

                places.forEach {
                    bounds.include(it.latLng)
                }

                googleMap.moveCamera(CameraUpdateFactory.newLatLngBounds(bounds.build(), 100))
            }
        }
    }

    private fun addMarkers(googleMap: GoogleMap) {
        places.forEach { place ->
            val marker = googleMap.addMarker(
                MarkerOptions()
                    .title(place.name)
                    .snippet(place.address)
                    .position(place.latLng)
            )
        }
    }
}

data class Place(
    val name: String,
    val latLng: LatLng,
    val address: String,
)

