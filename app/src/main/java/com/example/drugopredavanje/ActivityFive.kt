package com.example.drugopredavanje

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.drugopredavanje.adapters.NewsAdapter
import com.example.drugopredavanje.models.NewsModel
import com.example.drugopredavanje.models.NewsResponse
import com.example.drugopredavanje.util.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ActivityFive: AppCompatActivity() {

    private lateinit var newsRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five)

        newsRecyclerView = findViewById(R.id.newsRecycler)


        val apiInterface = ApiInterface.create().getAllNews()

        apiInterface.enqueue(object: Callback<NewsResponse> {
            override fun onResponse(call: Call<NewsResponse>, response: Response<NewsResponse>) {
                Log.e("LINK", response.raw().toString())
                Log.e("RESPONSE", response.message())
                response.body()?.let { nonNullNewsResponse ->
                    val newsList = nonNullNewsResponse.newsData.data
                    loadRecyclerWithNews(newsList)

                }
            }

            override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                Toast.makeText(applicationContext, "SERVER CONNECTION FAILED", Toast.LENGTH_LONG).show()
            }
        })
    }

    fun loadRecyclerWithNews(newsList: List<NewsModel>) {
        val newsAdapter = NewsAdapter(this, newsList)

        newsRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        newsRecyclerView.adapter = newsAdapter
    }
}