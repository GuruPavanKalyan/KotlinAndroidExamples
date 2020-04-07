package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var databinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        databinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        // Displaying Toast Message

        /*val text = databinding.sample1.text

        var toast : Toast = Toast.makeText(this,text,Toast.LENGTH_SHORT)
        toast.show()*/

        databinding.setbutton.setOnClickListener { setName() }

    }

    private fun setName() {
        val n = databinding.name.text.toString()

        //databinding.displayname.setText(n)

        //databinding.displayname.text = n

        val m1 : MyName = MyName(n)
        databinding.n = m1
        databinding.name.text.clear()
    }
}
