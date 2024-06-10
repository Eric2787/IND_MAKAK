package com.example.ind_makak.ui.Lugares

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.ind_makak.R
import com.example.ind_makak.databinding.FragmentLugarC3Binding

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
        binding.buttonFragLugarC3Regis.setOnClickListener {

        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}