package com.demo.fragmentlifecycledemo

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.demo.fragmentlifecycledemo.ui.main.MainFragment
import com.demo.fragmentlifecycledemo.ui.second.SecondFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val buttonMove = findViewById<Button>(R.id.buttonMove)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }

        buttonMove.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, SecondFragment.newInstance("Hey Buddy!"))
                .commitNow()
        }
    }
}