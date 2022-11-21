package com.emma_ea.mviappllciation.login

import androidx.lifecycle.ViewModel
import com.emma_ea.mviappllciation.login.store.LoginScreenAction
import com.emma_ea.mviappllciation.login.store.LoginScreenReducer
import com.emma_ea.mviappllciation.login.store.LoginScreenState
import com.emma_ea.mviappllciation.store.Store
import kotlinx.coroutines.flow.StateFlow

class LoginScreenViewModel : ViewModel() {

    private val store = Store(
        initialState = LoginScreenState(), reducer = LoginScreenReducer())

    val viewState: StateFlow<LoginScreenState> = store.state

    fun login(userName: String, password: String) {
        val action = LoginScreenAction.LoginUser(userName, password)
        store.dispatch(action)
    }

}