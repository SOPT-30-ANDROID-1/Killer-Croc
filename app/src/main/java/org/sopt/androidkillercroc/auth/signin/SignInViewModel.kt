package org.sopt.androidkillercroc.auth.signin

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.sopt.ui.lifecycle.SingleLiveEvent

class SignInViewModel : ViewModel() {
    val id = MutableLiveData<String>()
    val password = MutableLiveData<String>()

    private val _successLogin = SingleLiveEvent<Unit>()
    val successLogin : SingleLiveEvent<Unit> = _successLogin

    private val _failLogin = SingleLiveEvent<Unit>()
    val failLogin : SingleLiveEvent<Unit> = _failLogin

    private val isInputBlank: Boolean
        get() = id.value.isNullOrBlank() || password.value.isNullOrBlank()

    fun signIn() {
        if (isInputBlank) {
            _failLogin.call()
        } else {
            _successLogin.call()
        }
    }
}