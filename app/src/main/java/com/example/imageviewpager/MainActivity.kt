package com.example.imageviewpager

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var images: Array<Int> = arrayOf(R.drawable.place_1,R.drawable.place_2,
        R.drawable.place_3,R.drawable.place_4,R.drawable.place_5, R.drawable.place_6)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var adapter = ImageSliderAdapter(applicationContext, images)
        image_slider.adapter = adapter
    }
}
