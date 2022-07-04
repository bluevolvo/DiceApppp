package com.example.diceapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonRoll: Button = findViewById(R.id.button)
        buttonRoll.setOnClickListener {
            rollDice()
            Toast.makeText(this, "Dice no arolli", Toast.LENGTH_SHORT).show()
        }

        rollDice()

    }

    private fun rollDice() {
        val dice = DiceLogic(6)
        val dice1: ImageView = findViewById(R.id.imageView)
        // dice1.setImageResource(R.drawable.d1)
        dice1.contentDescription = dice.roll().toString()
        val drawableResource = when (dice.roll()) {
            1 -> R.drawable.d1
            2 -> R.drawable.d2
            3 -> R.drawable.d3
            4 -> R.drawable.d4
            5 -> R.drawable.d5
            else -> R.drawable.d6

        }
        dice1.setImageResource(drawableResource)
        // val dice2: TextView = findViewById(R.id.textView2)
        // dice1.text = dice.roll().toString()
        //  dice2.text = dice.roll().toString()
    }


}


class DiceLogic(private val numberOfSides: Int) {
    fun roll(): Int {
        return (1..numberOfSides).random()
    }

}

