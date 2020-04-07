package com.example.dicedatabinding


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.dicedatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {



    var r: Int = 0
    var r1: Int = 0

    lateinit var databinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        databinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

    }


    @SuppressLint("SetTextI18n")
    fun roll(view: View) {
        r = (1..6).random()
        r1 = (1..6).random()

        displayDice(r)
        displayDice1(r1)

        databinding.textview.text = r.toString() + " = " + r1.toString()
    }


    @SuppressLint("SetTextI18n")
    fun upCount(view: View) {
        if ((r == 0) and (r1 == 0)) {
            databinding.imageview.setImageResource(R.drawable.dice_1)
            databinding.imageview1.setImageResource(R.drawable.dice_1)

        } else if ((r < 6) and (r1 < 6)) {
            r++
            r1++
            databinding.textview.text = r.toString() + " = " + r1.toString()
            displayDice1(r1)
            displayDice(r)
        }
    }

    private fun displayDice(r: Int) {
        when (r) {
            1 -> databinding.imageview.setImageResource(R.drawable.dice_1)
            2 -> databinding.imageview.setImageResource(R.drawable.dice_2)
            3 -> databinding.imageview.setImageResource(R.drawable.dice_3)
            4 -> databinding.imageview.setImageResource(R.drawable.dice_4)
            5 -> databinding.imageview.setImageResource(R.drawable.dice_5)
            6 -> databinding.imageview.setImageResource(R.drawable.dice_6)
            else -> {
                databinding.imageview.setImageResource(R.drawable.empty_dice)
            }
        }
    }

    private fun displayDice1(r1: Int) {
        when (r1) {
            1 -> databinding.imageview1.setImageResource(R.drawable.dice_1)
            2 -> databinding.imageview1.setImageResource(R.drawable.dice_2)
            3 -> databinding.imageview1.setImageResource(R.drawable.dice_3)
            4 -> databinding.imageview1.setImageResource(R.drawable.dice_4)
            5 -> databinding.imageview1.setImageResource(R.drawable.dice_5)
            6 -> databinding.imageview1.setImageResource(R.drawable.dice_6)
            else -> {
                databinding.imageview1.setImageResource(R.drawable.empty_dice)
            }
        }
    }
}