package com.example.firebasepushnotification

import com.example.firebasepushnotification.constants.Companion.Base_url
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retrofitinstance {
    companion object {
        private val retrofit by lazy {//until the variable is not called the code below here will not initialize
            Retrofit.Builder()
                .baseUrl(Base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        val api by lazy {
            retrofit.create(NotificationAPI::class.java)//here we create the post request
        }
    }
}