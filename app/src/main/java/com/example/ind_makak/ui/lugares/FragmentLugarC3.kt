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
import com.example.ind_makak.databinding.FragmentLugarC3Binding
import kotlinx.coroutines.launch

class FragmentLugarC3 : Fragment() {
    private var _binding: FragmentLugarC3Binding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLugarC3Binding.inflate(inflater, container, false)
        binding.buttonFragLugarC3Regre.setOnClickListener {
            view: View -> view.findNavController().navigate(R.id.action_fragmentLugarC3_to_fragment_gallery)
        }

        binding.buttonFragLugarC3Regis.setOnClickListener{
            lifecycleScope.launch {
                try {
                    val nombre = binding.inputTextEditFragC3Nom.text.toString()
                    val correo = binding.inputTextEditFragC3Correo.text.toString()
                    val noServPub = binding.inputNumbFragC3NoServPub.text.toString()
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