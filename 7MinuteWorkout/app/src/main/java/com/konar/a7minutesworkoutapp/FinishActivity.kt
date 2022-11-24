package com.konar.a7minutesworkoutapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.konar.a7minutesworkoutapp.databinding.ActivityFinishBinding
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*

class FinishActivity : AppCompatActivity() {

    private var binding: ActivityFinishBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFinishBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setSupportActionBar(binding?.toolbarFinish)
        if (supportActionBar != null) {
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }
        binding?.toolbarFinish?.setNavigationOnClickListener {
            onBackPressed()
        }

        val historyDao = (application as WorkOutApp).db.historyDao()
        addDateToDatabase(historyDao)

        binding?.btnFinished?.setOnClickListener {
            finish()
        }
    }

    private fun addDateToDatabase(historyDao: HistoryDao) {
        val calender = Calendar.getInstance()
        val dateTime = calender.time
        Log.e("Date", " $dateTime")
        val sdf = SimpleDateFormat("dd MM yyyy HH:mm:ss", Locale.getDefault())
        val date = sdf.format(dateTime)
        Log.e("Formatted Date: ", " $date")

        lifecycleScope.launch {
            historyDao.insert(HistoryEntity(date))
            Log.e("Date", "Added...")
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}