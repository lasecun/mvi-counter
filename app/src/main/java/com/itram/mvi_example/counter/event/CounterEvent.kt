package com.itram.mvi_example.counter.event

import com.itram.mvi_example.utils.Event

sealed class CounterEvent: Event {
    object Increment : CounterEvent()
    object Decrement : CounterEvent()
    object Reset : CounterEvent()
}