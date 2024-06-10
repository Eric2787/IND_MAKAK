package com.example.ind_makak.ui.Lugares

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.ind_makak.R
import com.example.ind_makak.databinding.FragmentLugarD1Binding

class FragmentLugarD1 : Fragment() {
    private var _binding: FragmentLugarD1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLugarD1Binding.inflate(inflater, container, false)
        binding.buttonFragLugarD1Regre.setOnClickListener {
            view: View -> view.findNavController().navigate(R.id.action_fragmentLugarD1_to_fragment_gallery)
        }

        binding.buttonFragLugarD1Regis.setOnClickListener {

        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}