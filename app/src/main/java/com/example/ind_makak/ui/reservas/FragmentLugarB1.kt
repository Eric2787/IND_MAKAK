package com.example.ind_makak.ui.reservas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.ind_makak.R
import com.example.ind_makak.databinding.FragmentLugarB1Binding

class FragmentLugarB1 : Fragment() {

    private var _binding: FragmentLugarB1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       _binding = FragmentLugarB1Binding.inflate(inflater, container, false)
        binding.buttonFragLugarB1Regre.setOnClickListener {
            view: View -> view.findNavController().navigate(R.id.action_fragmentLugarB1_to_fragment_gallery)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}