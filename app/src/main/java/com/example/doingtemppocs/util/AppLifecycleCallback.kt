package com.example.doingtemppocs.util

import android.app.Activity

import android.os.Bundle

import android.app.Application
import android.app.Application.ActivityLifecycleCallbacks
import android.util.Log


internal class AppLifecycleCallback : ActivityLifecycleCallbacks {
    private var numStarted = 0
    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {}
    override fun onActivityStarted(activity: Activity) {
        if (numStarted == 0) {
            Log.d("1mvv"," onActivityStarted@@@@ ${numStarted}  } " )
        }
        numStarted++
    }

    override fun onActivityResumed(activity: Activity) {}
    override fun onActivityPaused(activity: Activity) {}
    override fun onActivityStopped(activity: Activity) {
        numStarted--
        if (numStarted == 0) {
            // app went to background

            Log.d("1mvv"," onActivityDestroyed @@@@ ${numStarted}  } " )
        }
    }

    override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {}
    override fun onActivityDestroyed(activity: Activity) {}
}