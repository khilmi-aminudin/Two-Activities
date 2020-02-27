package latihan.kotlin.twoactivities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSend = findViewById<Button>(R.id.button_main)
        btnSend.setOnClickListener {
            val message: String? = editText_main.text.toString()
            Toast.makeText(this,"$message sended",Toast.LENGTH_SHORT).show()

            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("key",message)
            startActivity(intent)
        }
    }
}
