package com.example.drugopredavanje.models

import com.google.gson.annotations.SerializedName

class NewsModel (
    val id: Int,
    val title: String,
    val text: String,
    val date: String,
    @SerializedName("cover_photo")
    val coverPhoto: String,
    val recommended: Int,
    val source: String
    )