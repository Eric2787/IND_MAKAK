package com.example.ind_makak.ui.ListaLugares

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.ind_makak.R
import com.example.ind_makak.databinding.FragmentListaLugaresBinding

class FragmentListaLugares : Fragment() {

    private var _binding: FragmentListaLugaresBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentListaLugaresBinding.inflate(inflater, container, false)
        binding.buttonLugar13.setOnClickListener {
            view: View -> view.findNavController().navigate(R.id.action_fragment_lista_lugares_nav_to_fragment_inicio)
        }

        binding.buttonLugar1.setOnClickListener {
            view: View -> view.findNavController().navigate(R.id.action_fragment_gallery_to_lugarA1)
        }

        binding.buttonLugar2.setOnClickListener {
            view: View -> view.findNavController().navigate(R.id.action_fragment_gallery_to_lugarA2)
        }

        binding.buttonLugar3.setOnClickListener {
            view: View -> view.findNavController().navigate(R.id.action_fragment_gallery_to_lugarA3)
        }

        binding.buttonLugar4.setOnClickListener {
            view: View -> view.findNavController().navigate(R.id.action_fragment_gallery_to_lugarB1)
        }

        binding.buttonLugar5.setOnClickListener {
            view: View -> view.findNavController().navigate(R.id.action_fragment_gallery_to_lugarB2)
        }

        binding.buttonLugar6.setOnClickListener {
            view: View -> view.findNavController().navigate(R.id.action_fragment_gallery_to_lugarB3)
        }

        binding.buttonLugar7.setOnClickListener {
            view: View -> view.findNavController().navigate(R.id.action_fragment_gallery_to_lugarC1)
        }

        binding.buttonLugar8.setOnClickListener {
            view: View -> view.findNavController().navigate(R.id.action_fragment_gallery_to_lugarC2)
        }

        binding.buttonLugar9.setOnClickListener {
            view: View -> view.findNavController().navigate(R.id.action_fragment_gallery_to_lugarC3)
        }

        binding.buttonLugar10.setOnClickListener {
            view: View -> view.findNavController().navigate(R.id.action_fragment_gallery_to_lugarD1)
        }

        binding.buttonLugar11.setOnClickListener {
            view: View -> view.findNavController().navigate(R.id.action_fragment_gallery_to_lugarD2)
        }

        binding.buttonLugar12.setOnClickListener {
            view: View -> view.findNavController().navigate(R.id.action_fragment_gallery_to_lugarD3)
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}