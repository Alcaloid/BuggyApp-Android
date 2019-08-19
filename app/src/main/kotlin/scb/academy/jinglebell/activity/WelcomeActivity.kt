package scb.academy.jinglebell.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent:Intent = Intent()
        val txt_name= intent.getStringExtra("name")
        println(txt_name)

    }
}
