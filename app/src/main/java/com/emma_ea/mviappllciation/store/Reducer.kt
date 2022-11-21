package com.emma_ea.mviappllciation.store

interface Reducer<S: State, A: Action> {

    fun reducer(currentState: S, action: A): S

}