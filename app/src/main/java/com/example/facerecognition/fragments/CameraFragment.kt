package com.example.facerecognition.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.facerecognition.R
import com.example.facerecognition.databinding.CameraFragmentBinding

class CameraFragment : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding: CameraFragmentBinding = DataBindingUtil.inflate(
            inflater, R.layout.camera_fragment,container,false)
        return binding.root
    }
}