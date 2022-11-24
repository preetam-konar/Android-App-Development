package com.konar.a7minutesworkoutapp

import android.app.Application

class WorkOutApp : Application() {
    val db by lazy {
        HistoryDatabase.getInstance(this)
    }
}