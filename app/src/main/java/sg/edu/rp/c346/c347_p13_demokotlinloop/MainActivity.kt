package sg.edu.rp.c346.c347_p13_demokotlinloop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            for (i in 1..5){
                Log.d("MainActivity", "$i")
            }

            val word = editText.text.toString()

            for(letter in word){
                Log.d("MainActivity", "$letter")
            }
        }
    }
}