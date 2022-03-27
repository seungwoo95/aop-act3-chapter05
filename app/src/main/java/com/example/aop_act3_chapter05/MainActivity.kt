package com.example.aop_act3_chapter05

import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Base64
import androidx.annotation.RequiresApi
import com.google.firebase.auth.FirebaseAuth
import java.security.MessageDigest

class MainActivity : AppCompatActivity() {

    private val auth: FirebaseAuth = FirebaseAuth.getInstance()

    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()

        if(auth.currentUser == null){
            startActivity(Intent(this,LoginActivity::class.java))
        }else{
            startActivity(Intent(this,LikeActivity::class.java))
        }
    }
}