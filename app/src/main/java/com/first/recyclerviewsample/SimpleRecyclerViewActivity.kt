package com.first.recyclerviewsample

import android.os.Bundle
import android.widget.SimpleAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.first.recyclerviewsample.Adapter.SimpleRecyclerViewAdapter

class SimpleRecyclerViewActivity : AppCompatActivity() {

    private val recyclerView : RecyclerView by lazy { findViewById(R.id.rcl_view) }
    private val mData: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_recycler_view)

        // 準備資料，塞50個項目到ArrayList裡
        for (i in 0..49) {
            mData.add("項目$i")
        }

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = SimpleRecyclerViewAdapter(mData)
    }
}