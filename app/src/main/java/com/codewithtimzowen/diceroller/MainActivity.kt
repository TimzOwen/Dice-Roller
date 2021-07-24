package com.codewithtimzowen.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //crete a reference to the button to roll the dice
        val rollButton : Button = findViewById(R.id.btn_roll)

        //set an onclick listener to action on the button
        rollButton.setOnClickListener {
            rollDice()
            Toast.makeText(this,"Button click",Toast.LENGTH_LONG).show()
        }
    }

    private fun rollDice(){




    }

}