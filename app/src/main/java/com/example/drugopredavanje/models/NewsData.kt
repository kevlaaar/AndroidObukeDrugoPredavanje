package com.example.drugopredavanje.models

import com.google.gson.annotations.SerializedName

class NewsData (
    @SerializedName("current_page")
    val currentPage: Int,
    @SerializedName("data")
    val data: List<NewsModel>,
    @SerializedName("from")
    val from: Int,
    @SerializedName("next_page_url")
    val nextPageUrl: String,
    @SerializedName("total")
    val total: Int
)