package org.sopt.androidkillercroc.auth.signup

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import org.sopt.androidkillercroc.R
import org.sopt.androidkillercroc.databinding.ActivitySignUpBinding
import org.sopt.ui.base.BindingActivity
import org.sopt.ui.context.toast

class SignUpActivity : BindingActivity<ActivitySignUpBinding>(R.layout.activity_sign_up) {
    private val viewModel by viewModels<SignUpViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.viewModel = viewModel

        observe()
    }

    private fun observe() {
        viewModel.successSignUp.observe(this) {
            successSignUp()
        }

        viewModel.failSignUP.observe(this) {
            toast("입력되지 않은 정보가 있습니다")
        }
    }

    private fun successSignUp() {
        toast("${viewModel.name.value}님 회원가입을 성공하셨습니다.")
        val intent = Intent().apply {
            putExtra("id", viewModel.id.value)
            putExtra("pw", viewModel.password.value)
        }
        setResult(Activity.RESULT_OK, intent)
        finish()
    }
}