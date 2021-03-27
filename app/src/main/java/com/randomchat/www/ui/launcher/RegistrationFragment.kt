package com.randomchat.www.ui.launcher

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.randomchat.www.R

class RegistrationFragment: Fragment(R.layout.fragment_register){

    @SuppressLint("RestrictedApi")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (requireActivity() as AppCompatActivity).supportActionBar?.apply{
            setShowHideAnimationEnabled(false)
            show()
        }

    }


}