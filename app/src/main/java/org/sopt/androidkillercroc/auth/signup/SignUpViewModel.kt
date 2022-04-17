package org.sopt.androidkillercroc.auth.signup

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.sopt.ui.lifecycle.SingleLiveEvent

class SignUpViewModel : ViewModel() {
    val name = MutableLiveData<String>()
    val id = MutableLiveData<String>()
    val password = MutableLiveData<String>()

    private val _successSignUp = SingleLiveEvent<Unit>()
    val successSignUp : SingleLiveEvent<Unit> = _successSignUp

    private val _failSignUp = SingleLiveEvent<Unit>()
    val failSignUP : SingleLiveEvent<Unit> = _failSignUp

    val isInputBlank: Boolean
        get() = id.value.isNullOrBlank() || password.value.isNullOrBlank() || name.value.isNullOrBlank()

    fun signUp() {
        if (isInputBlank) {
            _failSignUp.call()
        } else {
            _successSignUp.call()
        }
    }
}