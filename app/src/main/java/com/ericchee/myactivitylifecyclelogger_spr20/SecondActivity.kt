package com.ericchee.myactivitylifecyclelogger_spr20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    companion object {
        private val TAG = SecondActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.i(TAG, "onCreate() - B")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btnGoBack.setOnClickListener {
            finish()
            Log.i(TAG, "i am finishing()")
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart() - B")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume() - B")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause() - B")

    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop()- B")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy() - B")
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
            return true
        }

        return super.onOptionsItemSelected(item)
    }
}
