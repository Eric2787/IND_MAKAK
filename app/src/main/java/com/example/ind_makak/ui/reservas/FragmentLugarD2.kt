package com.example.ind_makak.ui.reservas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.ind_makak.R
import com.example.ind_makak.databinding.FragmentLugarD2Binding

class FragmentLugarD2 : Fragment() {
    private var _binding: FragmentLugarD2Binding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLugarD2Binding.inflate(inflater, container, false)
        binding.buttonFragLugarD2Regre.setOnClickListener {
            view: View -> view.findNavController().navigate(R.id.action_fragmentLugarD2_to_fragment_gallery)
        }

        binding.buttonFragLugarD2Regis.setOnClickListener {

        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}