package com.example.ind_makak.ui.lugares

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.ind_makak.R
import com.example.ind_makak.databinding.FragmentLugarC2Binding

class FragmentLugarC2 : Fragment() {

    private var _binding: FragmentLugarC2Binding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLugarC2Binding.inflate(inflater, container, false)
        binding.buttonFragLugarC2Regre.setOnClickListener {
            view: View -> view.findNavController().navigate(R.id.action_fragmentLugarC2_to_fragment_gallery)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}