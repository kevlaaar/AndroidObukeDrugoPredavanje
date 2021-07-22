package com.example.drugopredavanje.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.drugopredavanje.R
import com.example.drugopredavanje.models.NewsModel

class NewsAdapter(val context: Context, val newsList: List<NewsModel>): RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_news, parent, false)
        return NewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val newsItem = newsList[position]
        holder.bind(newsItem)
    }

    override fun getItemCount(): Int {
        return newsList.size
    }


    inner class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleText = itemView.findViewById<TextView>(R.id.newsTitleText)
        val dateText = itemView.findViewById<TextView>(R.id.newsDateText)

        fun bind(newsModel: NewsModel) {
            titleText.text = newsModel.title
            dateText.text = newsModel.date
        }
    }
}