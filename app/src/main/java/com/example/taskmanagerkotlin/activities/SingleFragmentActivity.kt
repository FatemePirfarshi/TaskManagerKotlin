package com.example.taskmanagerkotlin.activities

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.taskmanagerkotlin.R

abstract class SingleFragmentActivity : AppCompatActivity() {

    public abstract fun createFragment(): Fragment

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        setContentView(R.layout.activity_fragment)

        val fragmentManager = supportFragmentManager
        val fragment = fragmentManager.findFragmentById(R.id.fragment_container)

        if (fragment == null) {
            fragmentManager
                .beginTransaction()
                .add(R.id.fragment_container, createFragment())
                .commit()
        }
    }
}