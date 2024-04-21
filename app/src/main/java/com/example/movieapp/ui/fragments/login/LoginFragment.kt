package com.example.movieapp.ui.fragments.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.movieapp.R
import com.example.movieapp.databinding.FragmentSignUpBinding


class LoginFragment : Fragment() {

    private lateinit var binding:FragmentSignUpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignUpBinding.inflate(inflater)
        adaptLayout()
        setNavigation()
        return binding.root
    }

    private fun adaptLayout(){
        binding.textInputUsername.visibility= View.GONE
        binding.header.setText(R.string.button_login)
        binding.txtFooter.setText(R.string.not_account)
        binding.txtLogin.setText(R.string.button_sign_up)
        binding.btnSubmit.setText(R.string.button_login)
    }


    private fun setNavigation(){
        binding.txtLogin.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_signUpFragment)
        }
    }
}