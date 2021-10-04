package com.example.demoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text
class SecondActivity : AppCompatActivity() {
    private lateinit var textUserName : TextView
    private lateinit var textUid : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        textUserName = findViewById(R.id.tv_username)
        textUid = findViewById(R.id.tv_uid)

        val userName = intent.getStringExtra("username")
        val uid = intent.getStringExtra("uid")

        textUserName.text = "Username : "+userName
        textUid.text = "UID : "+uid
    }
}