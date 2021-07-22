package com.example.drugopredavanje.models

import com.google.gson.annotations.SerializedName

class NewsResponse (
    @SerializedName("news")
    val newsData: NewsData)