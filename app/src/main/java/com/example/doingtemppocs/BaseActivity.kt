package com.example.doingtemppocs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

abstract class BaseActivity : AppCompatActivity() {


   private  val TAG: String = "BaseActivity"
    companion object {
        var  activityResumedCount = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }

    override fun onResume() {
        super.onResume()

        Companion.activityResumedCount++;
        Log.d("mvv"," BaseActivity  onResume ${Companion.activityResumedCount}    ${getTag()} " )
    }


    override fun onStop() {
        super.onStop()

        Companion.activityResumedCount--;
//        Log.d("mvv"," BaseActivity  onStop :::  $activityResumedCount   ${getTag()} " )
        if(Companion.activityResumedCount <=0){
            Log.d("mvv", " send  onStop event >>>>>>>>  ${Companion.activityResumedCount}    ${getTag()} ")
        }
    }

     abstract fun getTag() :String
}