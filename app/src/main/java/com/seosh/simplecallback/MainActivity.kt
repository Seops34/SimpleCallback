package com.seosh.simplecallback

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.seosh.simplecallback.databinding.ActivityMainBinding
import com.seosh.simplecallback.event.BluetoothEvent
import com.seosh.simplecallback.event.CommEvent
import com.seosh.simplecallback.event.EngineEvent

class MainActivity : AppCompatActivity() {

    private var bluetoothEvent: BluetoothEvent? = null
    private var commEvent: CommEvent? = null
    private var engineEvent: EngineEvent? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)

        with(binding) {
            setLayout(this)
            subscribeUI()
            setCallback()
        }
    }

    private fun setLayout(binding: ActivityMainBinding) {

    }

    private fun subscribeUI() {

    }

    private fun setCallback() {
        bluetoothEvent = BluetoothEvent.instance.apply {
            onBluetoothEvent = {

            }
        }

        commEvent = CommEvent.instance.apply {
            onCommEventCallback = {

            }
        }

        engineEvent = EngineEvent.instance.apply {
            onEngineEventCallback = {

            }
        }
    }
}