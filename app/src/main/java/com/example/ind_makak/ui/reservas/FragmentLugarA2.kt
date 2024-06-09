package com.example.ind_makak.ui.reservas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.ind_makak.R
import com.example.ind_makak.databinding.FragmentLugarA2Binding

class FragmentLugarA2 : Fragment() {

    private var _binding: FragmentLugarA2Binding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLugarA2Binding.inflate(inflater, container, false)
        binding.buttonFragLugarA2Regis.setOnClickListener {

        }

        binding.buttonFragLugarA2Regre.setOnClickListener {
            view: View -> view.findNavController().navigate(R.id.action_fragmentLugarA2_to_fragment_gallery)
        }

        return binding.root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}