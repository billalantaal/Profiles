package com.example.profile.remote.response

import com.google.gson.annotations.SerializedName

data class ApiListResponse<out T> (
    @SerializedName("page") val page: Int,
    @SerializedName("per_page") val perPage: Int,
    @SerializedName("total") val total: Int,
    @SerializedName("total_pages") val totalPages: Int,
    @SerializedName("data") val data: List<T>
)