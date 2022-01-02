package com.example.firebasepushnotification

import com.example.firebasepushnotification.constants.Companion.Content_type
import com.example.firebasepushnotification.constants.Companion.Server_key
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST


interface NotificationAPI {
//This data is mostly used to describe the content of the Request/Response body.
// Some of the examples of Headers are: Auth tokens, Session-id, Content-Type, App Version,
// Content-Length etc. A Header is basically a name-value pair separated by a colon.
    @Headers("Authorisation:key=$Server_key","Content-type:$Content_type")
//Usually, whenever you have a web service that is defined as POST, the intention behind it will be
// that this service will save/add data on the backend side, such as adding a user from a sign up form.
//An HTTP POST request allows the consumer to apply a body to the request, a request body’s format can be defined by the Content-Type header.
    @POST("fcm/send")
    suspend fun postnotification(
        @Body notification:pushnotification
    ):Response<ResponseBody>
}//That means if you are using @Body, it should be only
// parameter. It is helpful when you have already a JsonObject and
// you want to send it as it with you api call.