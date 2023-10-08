package akakom.nomhs.kotlin.badminton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class daftar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)

        val mbutton2 =findViewById<Button>(R.id.button2)
        mbutton2.setOnClickListener {
            val inten = Intent(this, HomePage::class.java)
            startActivity(inten)
        }}
}