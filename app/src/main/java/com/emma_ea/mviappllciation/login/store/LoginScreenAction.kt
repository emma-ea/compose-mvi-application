package com.emma_ea.mviappllciation.login.store

import com.emma_ea.mviappllciation.store.Action

sealed class LoginScreenAction : Action {
    data class LoginUser(val userName: String, val password: String) : LoginScreenAction()
}