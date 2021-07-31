package com.example.rest_api

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [allmatch.newInstance] factory method to
 * create an instance of this fragment.
 */
class allmatch : Fragment() {
    // TODO: Rename and change types of parameters

  var rf=Retrofit.Builder()
      .baseUrl(retrointerface.Base_Url)
      .addConverterFactory(GsonConverterFactory.create()).build()
    var API = rf.create(retrointerface::class.java)
    var call = API.posts

    call? (object:Callback<List<PostModel?>?>{
        override fun onResponse(
            call: Call<List<PostModel?>?>,
            response: Response<List<PostModel?>?>
        ) {
           var postlist :List<PostModel>?= response.body() as List<PostModel>
           var Post = arrayOfNulls<String>(postlist!!.size)

            for(i in postlist!!.indices)
            {
                Post[i]= postlist!![i]!!.id.toString()

            }
        }

        override fun onFailure(call: Call<List<PostModel?>?>, t: Throwable) {
            TODO("Not yet implemented")
        }

    })


}