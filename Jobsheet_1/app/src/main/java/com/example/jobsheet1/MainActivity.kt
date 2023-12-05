package com.example.jobsheet1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jobsheet1.ui.theme.Jobsheet1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_word)

        val nameEditText: EditText = findViewById(R.id.nameEditText)
        val buttonButton: Button = findViewById(R.id.buttonButton)
        val buttonTextView: TextView = findViewById(R.id.buttonTextView)

        buttonTextView.text = "Konnichiwa!"

        buttonButton.setOnClickListener {
            val name = nameEditText.text.toString()
            buttonTextView.text = "Konnichiwa $name"
        }
    }
}