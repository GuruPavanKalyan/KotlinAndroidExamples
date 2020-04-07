package com.example.diceassignment
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    lateinit var img: ImageView
    lateinit var img1: ImageView
    var r: Int = 0
    var r1: Int = 0
    lateinit var tv: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        img = findViewById(R.id.imageview)
        img1 = findViewById(R.id.imageview1)
        tv = findViewById(R.id.textview)
    }


    @SuppressLint("SetTextI18n")
    fun roll(view: View) {
        r = (1..6).random()
        r1 = (1..6).random()

        displayDice(r)
        displayDice1(r1)
        tv.text = r.toString()+" = "+r1.toString()
    }

    @SuppressLint("SetTextI18n")
    fun upCount(view: View) {
        if ((r == 0) and (r1 == 0)) {
            img.setImageResource(R.drawable.dice_1)
            img1.setImageResource(R.drawable.dice_1)
        } else if ((r < 6) and (r1 < 6)) {

            r++
            r1++
            tv.text = r.toString() + " = " + r1.toString()
            displayDice1(r1)
            displayDice(r)
        }
    }

    private fun displayDice(r: Int) {
        when(r){
            1 -> img.setImageResource(R.drawable.dice_1)
            2 -> img.setImageResource(R.drawable.dice_2)
            3 -> img.setImageResource(R.drawable.dice_3)
            4 -> img.setImageResource(R.drawable.dice_4)
            5 -> img.setImageResource(R.drawable.dice_5)
            6 -> img.setImageResource(R.drawable.dice_6)
            else -> {
                img.setImageResource(R.drawable.empty_dice)
            }
        }
    }

    private fun displayDice1(r1: Int) {
        when(r1) {
            1 -> img1.setImageResource(R.drawable.dice_1)
            2 -> img1.setImageResource(R.drawable.dice_2)
            3 -> img1.setImageResource(R.drawable.dice_3)
            4 -> img1.setImageResource(R.drawable.dice_4)
            5 -> img1.setImageResource(R.drawable.dice_5)
            6 -> img1.setImageResource(R.drawable.dice_6)
            else -> {
                img1.setImageResource(R.drawable.empty_dice)
            }
        }
    }

}