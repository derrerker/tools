package com.srlm.zonequery

import android.app.Application

class App: Application() {
    companion object {
        private var instance :Application?=null
        fun instance()= instance!!
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}