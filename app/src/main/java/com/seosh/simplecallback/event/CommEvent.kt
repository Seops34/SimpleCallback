package com.seosh.simplecallback.event

class CommEvent private constructor() {

    private object HOLDER {
        val INSTANCE = CommEvent()
    }

    companion object {
        val instance: CommEvent by lazy {
            HOLDER.INSTANCE
        }
    }


    public fun sendCommEvent() {
        onCommEventCallback?.invoke()
    }

    var onCommEventCallback: (() -> Unit)? = null
}