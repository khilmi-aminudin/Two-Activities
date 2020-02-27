package latihan.kotlin.twoactivities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val EXTRA_MESSAGE = "MainActivity_Message"

        val mMessageEditText = findViewById<EditText>(R.id.editText_main)

        val btnSend = findViewById<Button>(R.id.button_main)
        btnSend.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            var message = mMessageEditText.text.toString()

            intent.putExtra(EXTRA_MESSAGE, message)
            startActivity(intent)

            val LOG_TAG: String? = MainActivity::class.java.simpleName
            Log.d(LOG_TAG, "Button Clicked")
        }

    }


}
