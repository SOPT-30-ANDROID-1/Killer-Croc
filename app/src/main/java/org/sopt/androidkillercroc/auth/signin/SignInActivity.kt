package org.sopt.androidkillercroc.auth.signin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import org.sopt.androidkillercroc.auth.signup.SignUpActivity
import org.sopt.androidkillercroc.databinding.ActivitySignInBinding
import org.sopt.androidkillercroc.home.HomeActivity
import org.sopt.ui.context.toast

class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding
    private val viewModel by viewModels<SignInViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initData()
        initView()
        observe()
    }

    private fun initData() {
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

    }

    private fun initView() {
        binding.btnRegister.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            signUpActivityLauncher.launch(intent)
        }
    }

    private fun observe() {
        viewModel.successLogin.observe(this) {
            Intent(this, HomeActivity::class.java).apply {
                startActivity(this)
                finish()
            }
        }
        viewModel.failLogin.observe(this) {
            toast("입력되지 않은 정보가 있습니다")
        }
    }

    private val signUpActivityLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) {
        if (it.resultCode == Activity.RESULT_OK) {
            it.data?.let {
                binding.apply {
                    editId.setText(it.getStringExtra("id"))
                    editPw.setText(it.getStringExtra("pw"))
                }
            }
        }
    }

}