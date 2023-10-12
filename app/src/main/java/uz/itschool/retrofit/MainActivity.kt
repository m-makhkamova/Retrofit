package uz.itschool.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Response
import uz.itschool.retrofit.networking.APIClient
import uz.itschool.retrofit.networking.APIService
import uz.itschool.retrofit.networking.model.Product
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var api = APIClient.getInstance().create(APIService::class.java)
        api.getAllProducts().enqueue(object :Callback<List<Product>>{
            override fun onResponse(call:Callback<List<Product>>, response: Response<List<Product>>){
                Log.d(TAG, "onResponse: ${response.body()}")
            }
        })
    }
}