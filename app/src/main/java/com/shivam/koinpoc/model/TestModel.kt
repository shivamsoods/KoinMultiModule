package com.shivam.koinpoc.model


import com.squareup.moshi.Json
import androidx.annotation.Keep

@Keep
data class TestModel(

    @Json(name = "id")
    val id: Int,
    @Json(name = "title")
    val title: String

)