package com.example.ind_makak.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.ind_makak.R
import com.example.ind_makak.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        binding.buttonLugar13.setOnClickListener {
            view: View -> view.findNavController().navigate(R.id.action_fragment_gallery_to_fragment_home)
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

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}