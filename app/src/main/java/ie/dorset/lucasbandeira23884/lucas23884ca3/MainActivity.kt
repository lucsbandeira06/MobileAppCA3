package ie.dorset.lucasbandeira23884.lucas23884ca3


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager

import com.google.gson.GsonBuilder
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.*
import java.io.IOException

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView_main.layoutManager = LinearLayoutManager(this)

        fetchJson()
    }

    fun fetchJson() {
        println("Attempting to fetch JSON")

        val url = "https://api.github.com/users/lucsbandeira06"

        val request = Request.Builder().url(url).build()

        val client = OkHttpClient()

            client.newCall(request).enqueue(object : Callback{
                override fun onFailure(call: Call, e: IOException) {
                    TODO("Not yet implemented")
                }

                override fun onResponse(call: Call, response: Response) {
                val body = response.body?.string()
                println(body)

                val gson = GsonBuilder().create()

                val homeFeed = gson.fromJson(body, HomeFeed::class.java)

                runOnUiThread(){

                    recyclerView_main.adapter = MainAdapter(homeFeed)

                }

            }
        })
    }
}
    class Users (val id: Int, val name: String, val followers: String, val following: String)

    class HomeFeed(val users: List<Users>)


    class Channel(val name: String, val profileImageUrl: String)








//Below is a commented section of an attempt of using retrofit url fetcher

//            recyclerView_main.adapter = MainAdapter(homeFeed)
//
//            var rf= Retrofit.Builder()
//                .baseUrl(RetrofitInterface.BASE_URL)
//                .addConverterFactory(GsonConverterFactory.create()).build()
//
//            var API = rf.create(RetrofitInterface::class.java)
//            var call = API.posts
//
//            call?.enqueue(object : Callback<List<Users?>?> {
//                override fun onResponse(
//                    call: Call<List<Users?>?>,
//                    response: Response<List<Users?>?>
//                ) {
//                    var userlist: List<Users>? = response.body() as List<Users>
//                    var post = arrayOfNulls<String>(userlist!!.size)
//
//                    for (i: Int in userlist!!.indices)
//                    post[i] = userlist!![i]!!.name
//
////                    var adapter = ArrayAdapter<String>(applicationContext, R.layout.card_view,post)
//
//
//                }
//
//                override fun onFailure(call: Call<List<Users?>?>, t: Throwable) {
//                    TODO("Not yet implemented")
//                }
//
//            })
//
//
//        }
//}



