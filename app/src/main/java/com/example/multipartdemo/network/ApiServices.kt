package com.example.multipartdemo.network

import com.example.multipartdemo.RestConstant
import com.example.multipartdemo.model.ResponseModel
import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface ApiServices {
    @Multipart
    @POST(RestConstant.UPLOADIMAGE)
    fun uploadImage(@Part filePart: MultipartBody.Part): Call<ResponseModel>
}