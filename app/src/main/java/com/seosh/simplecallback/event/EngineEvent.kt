package com.seosh.simplecallback.event

import com.seosh.simplecallback.data.EngineStatus

class EngineEvent private constructor() {

    private object HOLDER {
        val INSTANCE = EngineEvent()
    }

    companion object {
        val instance: EngineEvent by lazy {
            HOLDER.INSTANCE
        }
    }

    public fun sendEngineEvent(engineStatus: EngineStatus) {
        onEngineEventCallback?.invoke(engineStatus)
    }

    var onEngineEventCallback: ((EngineStatus) -> Unit)? = null
}