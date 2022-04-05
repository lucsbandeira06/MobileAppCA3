package ie.dorset.lucasbandeira23884.lucas23884ca3

import android.telecom.Call
import retrofit2.http.GET

interface RetrofitInterface {
    @get:GET("posts")
    val posts : retrofit2.Call<List<Users?>?>?

    companion object{
        const val BASE_URL = "https://api.github.com/users/lucsbandeira06"
    }
}