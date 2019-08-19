package scb.academy.jinglebell.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*
import scb.academy.jinglebell.R
import scb.academy.jinglebell.fragment.ProfileFragment

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        val intent:Intent = Intent()
//        val txt_name= intent.getStringExtra("name")
        val txt_name = ProfileFragment.name
        println(ProfileFragment.name)
        txt_welcome.text = "Welcome\n${txt_name}"

    }
}
