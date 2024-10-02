package com.example.uts_pagisore
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MembershipAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerViewMemberships)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val memberships = listOf(
            Membership("FAZ CAFE & BALLS", "2022/08/13", R.drawable.logo_faz_cafe),
            Membership("Syahri's Wash", "2022/07/23", R.drawable.logo_syahris_wash),
            Membership("Frost Gaming x Pool", "2022/07/13", R.drawable.logo_frost_gaming)
        )

        adapter = MembershipAdapter(memberships)
        recyclerView.adapter = adapter
    }
}