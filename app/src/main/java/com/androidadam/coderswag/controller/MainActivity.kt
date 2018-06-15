package com.androidadam.coderswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import android.widget.Toast
import com.androidadam.coderswag.R
import com.androidadam.coderswag.adapters.CategoryAdapter
import com.androidadam.coderswag.adapters.CategoryRecycleAdapter
import com.androidadam.coderswag.model.Category
import com.androidadam.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories)
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)


        /*categoryListView.setOnItemClickListener { adapterView, view, i, l ->
            val category = DataService.categories[i]
            Toast.makeText(this, "You clicked  on the ${category.title} cell", Toast.LENGTH_SHORT).show()
        }
        On click listeners for list view, wont work in recycleView.
        */
    }
}
