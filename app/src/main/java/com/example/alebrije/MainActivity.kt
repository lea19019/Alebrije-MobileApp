package com.example.alebrije

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // We will use this to display an introduction to the user about Alebrijes
        var introduction = "In the last century a mexican craftsman came up with a " +
                "revolutionary idea, he started creating alebrijes.\nThese are " +
                "creatures that can be anything you can imagine every alebrije created" +
                " is unique, and you will create yours right now.\n"

        var introAlebrije = findViewById<TextView>(R.id.introductionAlebrije)
        introAlebrije.setText(introduction)


        // We are getting the alebrije's attributes from user input
        var nameAle = findViewById<EditText>(R.id.inputName)
        var homeAle = findViewById<EditText>(R.id.inputHome)
        var ageAle = findViewById<EditText>(R.id.inputAge)
        var hob1Ale = findViewById<EditText>(R.id.inputHob1)
        var hob2Ale = findViewById<EditText>(R.id.inputHob2)
        var abi1Ale = findViewById<EditText>(R.id.inputAbi1)
        var abi2Ale = findViewById<EditText>(R.id.inputAbi2)

        // When user clicks on this button we will send the data to AlebrijeDisplay.kt
        // that will then display our story
        var btnAlebrije = findViewById<Button>(R.id.btnAlebrije)

        // Our listener
        btnAlebrije.setOnClickListener {

            // We need to send all the attributes
            var moveToDisplayAlebrije = Intent(getApplicationContext(), AlebrijeDisplay::class.java)
            moveToDisplayAlebrije.putExtra("name", nameAle.getText().toString())
            moveToDisplayAlebrije.putExtra("home", homeAle.getText().toString())
            moveToDisplayAlebrije.putExtra("age", ageAle.getText().toString().toInt())
            moveToDisplayAlebrije.putExtra("hob1", hob1Ale.getText().toString())
            moveToDisplayAlebrije.putExtra("hob2", hob2Ale.getText().toString())
            moveToDisplayAlebrije.putExtra("abi1", abi1Ale.getText().toString())
            moveToDisplayAlebrije.putExtra("abi2", abi2Ale.getText().toString())

            // Send them!
            startActivity(moveToDisplayAlebrije);
        }

    }
}