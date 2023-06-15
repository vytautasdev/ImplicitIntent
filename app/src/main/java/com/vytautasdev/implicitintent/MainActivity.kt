package com.vytautasdev.implicitintent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showWebPage(view: View) {
        val intent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://webb.nasa.gov/content/webbLaunch/news.html")
        )
        startActivity(intent)
    }
}