package com.ericchee.myactivitylifecyclelogger_spr20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        private val TAG = MainActivity::class.java.simpleName

        private const val OUT_COUNT = "out_count"
    }

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "onCreate()")

        if (savedInstanceState != null) {
            with(savedInstanceState) {
                count = getInt(OUT_COUNT, -1)

            }
        } else {
            count = 0
        }

        tvCount.text = "You've clicked:\n $count times"
        btnLaunchSecond.setOnClickListener { navigateToSecondActivity() }

        btnAdd.setOnClickListener {
            count++
            tvCount.text = "You've clicked:\n $count times"
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {

        outState.putInt(OUT_COUNT, count)

        super.onSaveInstanceState(outState)
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause()")

    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop()")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy()")

    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart()")
    }


    private fun navigateToSecondActivity() {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}
