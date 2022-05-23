package com.example.databindngrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.databindngrecyclerview.databinding.ActivityMainBinding
import com.example.databindngrecyclerview.databinding.RowItemBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bindingrow: RowItemBinding
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter:CustomAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val personOne = Person("bureak")
        val personTwo = Person("sadfsf")
        val personTheree = Person("ghjfgh")

        val degis = arrayListOf<Person>(personOne,personTwo,personTheree)

        adapter = CustomAdapter(degis)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        binding.recyclerView.adapter = adapter


    }
}