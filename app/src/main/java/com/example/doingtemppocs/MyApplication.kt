package com.example.doingtemppocs

import android.app.Application
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import androidx.lifecycle.ProcessLifecycleOwner

class MyApplication : Application() , LifecycleObserver {

    override fun onCreate() {
        super.onCreate()
        Log.d("mvv","onCreate MyApplication ")
        ProcessLifecycleOwner.get().lifecycle.addObserver(this)
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public fun onMoveToForeground() {
        Companion.wasInBackground =true;


        Log.d("mvv"," !!!! MyApplication onMoveToForeground   ${Companion.wasInBackground}  } " )
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public fun onMoveToBackground() {
        Companion.wasInBackground =false;

        Log.d("mvv"," !!!! MyApplication onMoveToBackground   ${Companion.wasInBackground}  } " )
    }

    companion object {
        var wasInBackground = false
    }
}