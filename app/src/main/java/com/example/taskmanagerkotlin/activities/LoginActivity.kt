package com.example.taskmanagerkotlin.activities

import com.example.taskmanagerkotlin.fragments.LoginFragment

class LoginActivity : SingleFragmentActivity() {

    override fun createFragment() = LoginFragment.newInstance()
}