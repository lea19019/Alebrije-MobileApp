package com.example.alebrije

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AlebrijeDisplay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alebrije)


        var name = intent?.extras?.getString("name").toString()
        var home = intent?.extras?.getString("home").toString()
        var age = intent?.extras?.getInt("age").toString().toInt()
        var hob1 = intent?.extras?.getString("hob1").toString()
        var hob2 = intent?.extras?.getString("hob2").toString()
        var abi1 = intent?.extras?.getString("abi1").toString()
        var abi2 = intent?.extras?.getString("abi2").toString()
        var introAlebrije = findViewById<TextView>(R.id.alebrijeStory)

        var alebrijeStory = "This is the story of ${name}, an alibreji, a mysterious\n" +
                "creature. It lives in ${home}, a magic place full of\n" +
                "stories.\n" +
                "Some people says he has been there since the creation,\n" +
                "but in reality he is ${age} years old.\n" +
                "There was once a man able to live with him, he said\n" +
                "${name} loved to ${hob1} all day long, and it also\n" +
                "enjoyed to ${hob2} on weekends.\n" +
                "Alebrijes are special creatures, they have abilities\n" +
                "beyond our understanding, and ${name} is not the\n" +
                "exception. It posses incredible abilities, being two\n" +
                "of them to be ${abi1} and ${abi2}, making it a\n" +
                "true guardian of ${home}, his home."

        introAlebrije.setText(alebrijeStory)
    }
}


