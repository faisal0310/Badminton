package akakom.nomhs.kotlin.badminton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val ImageView = findViewById<ImageView>(R.id.imageView)
        ImageView.setOnClickListener {
            val inten = Intent(this, nextpage::class.java)
            startActivity(inten)
        }
    }
}