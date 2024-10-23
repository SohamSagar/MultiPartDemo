package com.example.multipartdemo.network

import com.example.multipartdemo.RestConstant
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    var retrofit: ApiServices = Retrofit.Builder().baseUrl(RestConstant.BASEURL).addConverterFactory(GsonConverterFactory.create()).build().create(ApiServices::class.java)
}