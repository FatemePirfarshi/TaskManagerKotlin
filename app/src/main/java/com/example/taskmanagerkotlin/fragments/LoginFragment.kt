package com.example.taskmanagerkotlin.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.taskmanagerkotlin.R
import com.google.android.material.textfield.TextInputLayout

class LoginFragment : Fragment() {

    private lateinit var mEditTextUserName: TextInputLayout
    private lateinit var mEditTextPassword: TextInputLayout
    private lateinit var mButtonLogIn: Button
    private lateinit var mButtonSignUp: TextView
    private lateinit var mFrameLayout: FrameLayout

//    private val signupUsername: String? = null
//    private val signupPassword: String? = null
//    private val mUserId: UUID? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_login, container, false)

        findViews(view)
        setListener()
        return view
    }

    private fun setListener() {
        mButtonLogIn.setOnClickListener {

        }
    }

    private fun findViews(view: View) {
        mEditTextUserName = view.findViewById(R.id.edittxt_username) as TextInputLayout
        mEditTextPassword = view.findViewById(R.id.edittxt_password) as TextInputLayout
        mButtonLogIn = view.findViewById(R.id.btn_log_in) as Button
        mButtonSignUp = view.findViewById(R.id.btn_sign_up) as TextView
        mFrameLayout = view.findViewById(R.id.root_layout_login) as FrameLayout
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            LoginFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}