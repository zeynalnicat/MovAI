package com.example.movieapp.ui.fragments.landing

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.movieapp.R
import com.example.movieapp.databinding.FragmentLandingBinding
import com.example.movieapp.databinding.FragmentSignUpBinding

class LandingFragment : Fragment() {
     private lateinit var binding: FragmentLandingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLandingBinding.inflate(inflater)
        setNavigation()
        return binding.root
    }

    private fun setNavigation(){
        binding.login.setOnClickListener{
            findNavController().navigate(R.id.action_landingFragment_to_loginFragment)
        }

        binding.signUp.setOnClickListener{
            findNavController().navigate(R.id.action_landingFragment_to_signUpFragment)
        }
    }

}