package com.emma_ea.mviappllciation.login.store

import com.emma_ea.mviappllciation.store.Action
import com.emma_ea.mviappllciation.store.Reducer
import com.emma_ea.mviappllciation.store.State

class LoginScreenReducer : Reducer<LoginScreenState, LoginScreenAction> {

    override fun reducer(currentState: LoginScreenState, action: LoginScreenAction): LoginScreenState {
        return when (action) {
            is LoginScreenAction.LoginUser -> {
                currentState.copy(userName = action.userName, password = action.password)
            }
        }
    }
}