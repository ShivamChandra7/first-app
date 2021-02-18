package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dice_image=findViewById<ImageView>(R.id.diceImage);
        dice_image.setImageResource(R.drawable.dice_1);

        val roll_button=findViewById<Button>(R.id.rollButton);
       // var randomNumber=java.util.Random().nextInt(bound:6)
        roll_button.setOnClickListener {
            val randomNumber=java.util.Random().nextInt(6);
            when(randomNumber)
            {
                    0 -> dice_image.setImageResource(R.drawable.dice_1);
                    1 -> dice_image.setImageResource(R.drawable.dice_2);
                    2 -> dice_image.setImageResource(R.drawable.dice_3);
                    3 -> dice_image.setImageResource(R.drawable.dice_4);
                    4 -> dice_image.setImageResource(R.drawable.dice_5);
                    5 -> dice_image.setImageResource(R.drawable.dice_6);
            }
        }
    }
}