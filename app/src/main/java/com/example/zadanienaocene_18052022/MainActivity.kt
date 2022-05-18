package com.example.zadanienaocene_18052022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Poprzedni = findViewById<Button>(R.id.btnPoprzedni);
        var Nastepny = findViewById<Button>(R.id.btnNastepny);
        var obraz = findViewById<ImageView>(R.id.Obraz);
        var tytul = findViewById<TextView>(R.id.NapisTytul);
        var obrazzmiana = 1;
        Poprzedni.setOnClickListener {
            obrazzmiana -= 1;
            when (obrazzmiana) {
                0 -> obraz.setImageResource(R.drawable.kot)
                1 -> obraz.setImageResource(R.drawable.pies)
                2 -> obraz.setImageResource(R.drawable.pingwin)
                3 -> obraz.setImageResource(R.drawable.tygrys)
                4 -> obraz.setImageResource(R.drawable.zyrafa)
            }
            when (obrazzmiana) {
                0 -> tytul.text = "kot"
                1 -> tytul.text = "pies"
                2 -> tytul.text = "pingwin"
                3 -> tytul.text = "kot"
                4 -> tytul.text = "kot"
            }
            Nastepny.setOnClickListener {
                obrazzmiana += 1;
                when (obrazzmiana) {
                    0 -> obraz.setImageResource(R.drawable.kot)
                    1 -> obraz.setImageResource(R.drawable.pies)
                    2 -> obraz.setImageResource(R.drawable.pingwin)
                    3 -> obraz.setImageResource(R.drawable.tygrys)
                    4 -> obraz.setImageResource(R.drawable.zyrafa)
                }
            }
        }
    }
}