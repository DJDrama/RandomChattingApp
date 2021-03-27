package com.randomchat.www.ui.launcher

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.randomchat.www.R
import com.randomchat.www.databinding.FragmentLoginBinding

class LoginFragment : Fragment(R.layout.fragment_login) {
    private var _binding: FragmentLoginBinding? = null
    private val binding: FragmentLoginBinding
        get() = _binding!!

    @SuppressLint("RestrictedApi")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentLoginBinding.bind(view)
        (requireActivity() as AppCompatActivity).supportActionBar?.apply{
            setShowHideAnimationEnabled(false)
            hide()
        }


        binding.btnLogin.setOnClickListener {
            // Login
        }
        binding.btnRegister.setOnClickListener{
            // Register
            findNavController().navigate(R.id.action_loginFragment_to_registrationFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }
}