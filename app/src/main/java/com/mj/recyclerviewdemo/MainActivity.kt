package com.mj.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter = LanguageAdapter()

        val listOfLanguage = listOf<String>("Android", "java", "Kotlin", "Php")
        val listOfNewLanguage = listOf<String>("Kotlin", "Python", "CSharp", "Android")

        adapter.submitList(listOfLanguage)
        val recyclerView: RecyclerView = findViewById(R.id.recy_language)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter

        Handler(Looper.getMainLooper()).postDelayed(Runnable {
            adapter.submitList(listOfNewLanguage)
        }, 10000)

    }
}