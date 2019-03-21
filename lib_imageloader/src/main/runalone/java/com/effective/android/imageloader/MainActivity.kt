package com.effective.android.imageloader

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.effective.android.imageloader.MainAdapter.Type.*
import com.effective.android.imageloader.R

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    findViewById<RecyclerView>(R.id.list).apply {
      layoutManager = LinearLayoutManager(context)
      adapter = MainAdapter(context, mutableListOf(
              Mask, NinePatchMask, CropTop, CropCenter, CropBottom, CropSquare, CropCircle,ColorFilter, Grayscale,RoundedCorners,
          Blur, SupportRSBlur, Toon, Sepia, Contrast, Invert, Pixel, Sketch, Swirl, Brightness,
          Kuawahara, Vignette
      ))
    }
  }
}
