package com.example.rest_api

import retrofit2.Call
import retrofit2.http.GET

interface retrointerface {

    @get:GET("v2/venues/search?ll=40.7484,-73.9857&oauth_token=NPKYZ3WZ1VYMNAZ2FLX1WLECAWSMUVOQZOIDBN53F3LVZBPQ&v=20180616")
    val posts : Call<List<PostModel?>?>?


    companion object {


        const val Base_Url =
            "https://api.foursquare.com"
    }
}