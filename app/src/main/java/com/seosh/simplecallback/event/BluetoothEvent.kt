package com.seosh.simplecallback.event

import com.seosh.simplecallback.data.BluetoothStatus

class BluetoothEvent private constructor() {

    private object HOLDER {
        val INSTANCE = BluetoothEvent()
    }

    companion object {
        val instance = HOLDER.INSTANCE
    }

    public fun sendBluetoothEvent(bluetoothStatus: BluetoothStatus) {
        onBluetoothEvent?.invoke(bluetoothStatus)
    }

    var onBluetoothEvent: ((BluetoothStatus) -> Unit)? = null
}