package com.emma_ea.mviappllciation.login.store

import com.emma_ea.mviappllciation.store.State

data class LoginScreenState(
    val userName: String = "",
    val password: String = ""
) : State