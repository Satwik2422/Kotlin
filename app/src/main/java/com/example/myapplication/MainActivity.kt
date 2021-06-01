package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var input=findViewById<EditText>(R.id.input)
        var btn=findViewById<Button>(R.id.btn)
        var output=findViewById<TextView>(R.id.output)
        btn.setOnClickListener(View.OnClickListener {
            val pi=3.141
            var radius:Double=input.text.toString().toDouble()
            var area=pi*radius*radius
            output.setText("$area")
        } )

    }
}