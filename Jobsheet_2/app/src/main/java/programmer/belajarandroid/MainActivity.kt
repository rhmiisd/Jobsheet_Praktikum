package programmer.belajarandroid

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import programmer.belajarandroid.ui.theme.BelajarandroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_word)

        val namaEditText: EditText = findViewById(R.id.namaEditText)
        val buttonButton: Button = findViewById(R.id.buttonButton)
        val buttonTextView: TextView = findViewById(R.id.buttonTextView)

        buttonTextView.text = resources.getString(R.string.app_name)

        buttonButton.setOnClickListener {
            val nama = namaEditText.text.toString()
            buttonTextView.text = resources.getString(R.string.buttonTextView, nama)
        }

        resources.getStringArray(R.array.names).forEach {
            Log.i("PNZ",it)
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BelajarandroidTheme {
        Greeting("Android")
    }
}