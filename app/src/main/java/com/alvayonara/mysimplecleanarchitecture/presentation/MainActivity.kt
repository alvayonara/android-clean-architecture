package com.alvayonara.mysimplecleanarchitecture.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.alvayonara.mysimplecleanarchitecture.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val factory = MainViewModelFactory.getInstance()
        val viewModel = ViewModelProvider(this, factory)[MainViewModel::class.java]

        viewModel.setName("Alva")
        viewModel.message.observe(this, {
            tv_welcome.text = it.welcomeMessage
        })
    }
}