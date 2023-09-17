package com.itram.mvi_example.counter.state

import com.itram.mvi_example.utils.State

data class CounterState(
    val counter: Int = 0
): State