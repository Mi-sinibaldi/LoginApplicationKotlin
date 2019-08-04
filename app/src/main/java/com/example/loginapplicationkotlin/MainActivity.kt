package com.example.loginapplicationkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_login.setOnClickListener {
           var status =
               if(ed_userName.text.toString().equals("admin")
                       && ed_password.text.toString().equals("admin"))
            "Logged In Sucessfully"
            else
            "Login Fail"

            Toast.makeText(this, status, Toast.LENGTH_SHORT).show()
        }
    }
}
