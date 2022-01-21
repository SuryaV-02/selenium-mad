package com.sparrow.selenium

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var toggle = true
    var current_text_size = 30
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_color = findViewById<Button>(R.id.btn_color)
        val btn_size = findViewById<Button>(R.id.btn_size)
        val tv_major_text = findViewById<TextView>(R.id.tv_major_text)


        btn_color.setOnClickListener {
            if(toggle){
                tv_major_text.setTextColor(resources.getColor(R.color.new_color))
            }else{
                tv_major_text.setTextColor(resources.getColor(R.color.black))
            }
            toggle = !toggle
            Toast.makeText(this, "Look at text color", Toast.LENGTH_SHORT).show()

        }

        btn_size.setOnClickListener {
            current_text_size+=1
            tv_major_text.textSize = current_text_size.toFloat()
            Toast.makeText(this, "Look at the text size", Toast.LENGTH_SHORT).show()
        }

    }
}