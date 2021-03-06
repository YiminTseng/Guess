package com.tseng.guess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    val secretNumber = SecretNumber()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity","secret:"+secretNumber.secret)
    }

    fun check(v : View){
        val n = ed_number.text.toString().toInt()
        Log.d("MainActivity","number:"+n)
        val diff = secretNumber.validate(n)
        var msg = "Bingo,you got it"
        if ( diff < 0){
            msg="Bigger"
        }else if(diff > 0){
            msg="Smaller"
        }
//        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
        AlertDialog.Builder(this)
            .setTitle("Message")
            .setMessage(msg)
            .setPositiveButton("ok",null)
            .show()
    }
}