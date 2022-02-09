package com.prime.dacusigntest

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class DacuSignApp  : Application(){
    override fun onCreate() {
        super.onCreate()
    }


}