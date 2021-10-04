package com.example.demoapp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
class MainActivity : AppCompatActivity() {
    private lateinit var btnSendData : Button
    private lateinit var editUserName : EditText
    private lateinit var editUid : EditText
    private lateinit var editPhn : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSendData = findViewById(R.id.register)
        editUserName = findViewById(R.id.name)
        editUid = findViewById(R.id.uid)
        editPhn = findViewById(R.id.number)

        btnSendData.setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java)
                .putExtra("username",editUserName.text.toString())
                .putExtra("uid",editUid.text.toString())
                .putExtra("number",editPhn.text.toString()))
        }


    }
}