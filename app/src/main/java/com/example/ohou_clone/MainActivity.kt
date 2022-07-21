package com.example.ohou_clone

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 색 변경
        textView = findViewById(R.id.rec_hc_text1)
        val textData: String = textView.text.toString()
        val builder = SpannableStringBuilder(textData)

        val colorBlueSpan = ForegroundColorSpan(Color.rgb(3, 169, 244))

        //

    }

}