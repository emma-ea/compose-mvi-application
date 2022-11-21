package com.emma_ea.mviappllciation.store

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

open class Store<S: State, A: Action>(
    initialState: S, private val reducer: Reducer<S, A>) {

    private val _state = MutableStateFlow(initialState)
    val state: StateFlow<S> = _state.asStateFlow()

    private val currentState get() = _state.value

    fun dispatch(action: A) {
        val newState = reducer.reducer(currentState, action)
        _state.value = newState
    }

}