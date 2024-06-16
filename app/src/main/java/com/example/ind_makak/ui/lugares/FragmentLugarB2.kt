package com.example.ind_makak.ui.lugares

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.navigation.findNavController
import com.example.ind_makak.R
import com.example.ind_makak.databinding.FragmentLugarB2Binding
import kotlinx.coroutines.launch

class FragmentLugarB2 : Fragment() {
    private var _binding: FragmentLugarB2Binding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLugarB2Binding.inflate(inflater, container, false)
        binding.buttonFragLugarB2Regre.setOnClickListener {
            view: View -> view.findNavController().navigate(R.id.action_fragmentLugarB2_to_fragment_gallery)
        }

        binding.buttonFragLugarB2Regis.setOnClickListener{
            lifecycleScope.launch {
                try {
                    val nombre = binding.inputTextEditFragB2Nom.text.toString()
                    val correo = binding.inputTextEditFragB2Correo.text.toString()
                    val noServPub = binding.inputNumbFragB2NoServPub.text.toString()
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