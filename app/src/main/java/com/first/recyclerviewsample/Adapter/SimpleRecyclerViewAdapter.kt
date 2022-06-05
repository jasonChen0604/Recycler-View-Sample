package com.first.recyclerviewsample.Adapter

import android.graphics.Color
import android.graphics.ColorSpace
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.first.recyclerviewsample.R

class SimpleRecyclerViewAdapter(private val dataSet: ArrayList<String>):
    RecyclerView.Adapter<SimpleRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): SimpleRecyclerViewAdapter.ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.simple_adapter_item, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = dataSet[position]
        holder.textView.setTextColor(Color.rgb(position*20 % 255 ,position*10 % 255,position*1 % 255))
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView

        init {
            // Define click listener for the ViewHolder's View.
            textView = view.findViewById(R.id.textView)
        }
    }
}