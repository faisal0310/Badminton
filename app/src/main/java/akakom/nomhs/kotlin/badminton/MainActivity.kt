package akakom.nomhs.kotlin.badminton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mbutton =findViewById<Button>(R.id.button)
        val mbutton3 =findViewById<Button>(R.id.button3)
        mbutton.setOnClickListener {
            val inten = Intent( this,HomePage::class.java)
            startActivity(inten)
        }
        mbutton3.setOnClickListener {
            val inten = Intent( this,daftar::class.java)
            startActivity(inten)

        }
    }
}