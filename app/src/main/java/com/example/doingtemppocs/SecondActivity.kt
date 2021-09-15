package com.example.doingtemppocs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.doingtemppocs.ui.secondfragment2.SecondFragment2

class SecondActivity : BaseActivity() {


    private  val TAG: String = "SecondActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, SecondFragment2.newInstance())
                .commitNow()
        }
    }



    override fun getTag(): String {
        return TAG
    }
}