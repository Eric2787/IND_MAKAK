package com.example.ind_makak.ui.lugares

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.findNavController
import com.example.ind_makak.R
import com.example.ind_makak.databinding.FragmentLugarA1Binding
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

class FragmentLugarA1 : Fragment() {

    private var _binding: FragmentLugarA1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLugarA1Binding.inflate(inflater, container, false)

        binding.buttonFragLugarA1Regre.setOnClickListener {
            view: View -> view.findNavController().navigate(R.id.action_fragmentLugarA1_to_fragment_gallery)
        }
        binding.buttonFragLugarA1Regis.setOnClickListener {
            lifecycleScope.launch {
                try {
                    val nombre = binding.inputTextEditFragA1Nom.text.toString()
                    val correo = binding.inputTextEditFragA1Correo.text.toString()
                    val noServPub = binding.inputNumbFragA1NoServPub.text.toString()
                    val response = ApiService.getInstance().postRegistro(nombre, correo, noServPub)
                    if (response.isSuccessful) {
                        Toast.makeText(activity, "Su registro ha sido exitoso", Toast.LENGTH_LONG).show()
                    }
                } catch (_: Exception) {
                        Toast.makeText(activity, "Error al registrar", Toast.LENGTH_LONG).show()
                }
            }
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}

interface ApiService{
    companion object RetrofitClient {
        @Volatile
        private var instance: ApiService ? = null
        fun getInstance(): ApiService = instance ?: crearInstancia()
        private fun crearInstancia(): ApiService = Retrofit.Builder()
            .baseUrl("http://192.168.1.75/api.php/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(OkHttpClient.Builder().build())
            .build()
            .create(ApiService::class.java)
    }
    @FormUrlEncoded
    @POST("registrar")
    suspend fun postRegistro(
        @Field("nombre") nombre: String,
        @Field("correo") correo: String,
        @Field("noServPub") noServPub: String
    ): Response<Unit>
}
