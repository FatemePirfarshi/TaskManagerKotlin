package com.example.taskmanagerkotlin.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import androidx.fragment.app.Fragment
import com.example.taskmanagerkotlin.R
import com.google.android.material.textfield.TextInputLayout

class SignUpFragment : Fragment() {

    private lateinit var mEditTextSignUpUserName: TextInputLayout
    private lateinit var mEditTextSignUpPassword: TextInputLayout
    private lateinit var mButtonSignup: Button
    private lateinit var mIsAdmin: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_sign_up, container, false)
        findViews(view)
        return view
    }

    private fun findViews(view: View) {
        mEditTextSignUpUserName = view.findViewById(R.id.edittxt_signup_username) as TextInputLayout
        mEditTextSignUpPassword = view.findViewById(R.id.edittxt_signup_password) as TextInputLayout
        mButtonSignup = view.findViewById(R.id.btn_signup) as Button
        mIsAdmin = view.findViewById(R.id.checkBox_admin) as CheckBox
    }


    companion object {

        @JvmStatic
        fun newInstance() =
            SignUpFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}