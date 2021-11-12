package com.mws.tugasmws

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class Dashboard : AppCompatActivity(), View.OnClickListener {

    private lateinit var ig_tshirt1 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        ig_tshirt1 = findViewById(R.id.ig_tshirt1)
        ig_tshirt1.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val intent = Intent(this, Detail :: class.java)
        startActivity(intent)
    }
}