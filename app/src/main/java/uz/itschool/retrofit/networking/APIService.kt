package uz.itschool.retrofit.networking

import retrofit2.http.GET
import uz.itschool.retrofit.networking.model.Product

interface APIService {
    @GET("/products")
    fun getAllProducts(): Call<List<Product>>
}