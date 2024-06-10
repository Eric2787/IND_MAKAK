package com.example.ind_makak.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.ind_makak.R
import com.example.ind_makak.databinding.FragmentInicioBinding

class FragmentInicio : Fragment() {

    private var _binding: FragmentInicioBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding  = FragmentInicioBinding.inflate(inflater, container, false)
        binding.buttonHome1.setOnClickListener {
                view: View -> view.findNavController().navigate(R.id.action_fragment_home_to_fragment_gallery)
        }

        return binding.root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}