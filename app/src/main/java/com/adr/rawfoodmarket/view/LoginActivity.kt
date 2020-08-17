package com.adr.rawfoodmarket.view

import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import androidx.appcompat.app.AppCompatActivity
import com.adr.rawfoodmarket.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    companion object {
        const val VISIBILITY = "visibility"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        iv_login_visibility.setOnClickListener {

            if (iv_login_visibility.tag == VISIBILITY){
                et_login_password.transformationMethod = PasswordTransformationMethod.getInstance()
                iv_login_visibility.setImageResource(R.drawable.ic_visibility_off)
                iv_login_visibility.tag = "visibility_off"
            } else {
                et_login_password.transformationMethod = HideReturnsTransformationMethod.getInstance()
                iv_login_visibility.setImageResource(R.drawable.ic_visibility)
                iv_login_visibility.tag = "visibility"
            }
        }
    }
}