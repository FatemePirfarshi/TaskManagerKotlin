package com.example.taskmanagerkotlin.activities

import com.example.taskmanagerkotlin.fragments.SignUpFragment

class SignUpActivity : SingleFragmentActivity() {

    override fun createFragment() = SignUpFragment.newInstance()
}
