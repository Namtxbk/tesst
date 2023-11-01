package com.example.mailkotlin

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.ActionBar
import com.example.mailkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    val mail = arrayOf(
            Mail("Test1",
                "No one can do this for you",
                "15:10 PM",
                true),
            Mail("test2",
            "I am the hero start",
            "12:20 AM",
            true),
            Mail("Namsieunhan",
            "Trong lập trình Android, một Fragment là một thành phần UI độc lập, có thể được sử dụng lại trong các hoạt động (Activity) khác nhau của ứng dụng. Fragment được sử dụng để chia nhỏ giao diện người dùng thành các phần nhỏ hơn, giúp quản lý và tái sử dụng mã và giao diện dễ dàng hơn.",
            "5:30 AM",
            true))
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val actionBar = supportActionBar
        actionBar?.title = "      Inbox"
        actionBar?.setIcon(R.drawable.whitemenu)
        actionBar?.setDisplayUseLogoEnabled(true)
        actionBar?.setDisplayShowHomeEnabled(true)

        val myListAdapter = MailAdapter(this, mail)
        binding.mailView.adapter = myListAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }
}