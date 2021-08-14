package com.codewithtimzowen.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class DoubleRoller : AppCompatActivity() {

    lateinit var imageView : ImageView
    lateinit var btnRoll : Button
    lateinit var imageview2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_double_roller)

        imageView = findViewById(R.id.ivRoll2)
        imageview2 = findViewById(R.id.ivRoll)

        btnRoll.setOnClickListener {
            rollDice()
            rollTwo()
        }

    }

    private fun rollDice(){

        val rolledImage = when(6){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        imageView.setImageResource(rolledImage)
    }

    private fun rollTwo(){
        val rolled = when(6){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        imageview2.setImageResource(rolled)
    }
}