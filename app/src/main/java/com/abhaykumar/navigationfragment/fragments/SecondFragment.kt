package com.abhaykumar.navigationfragment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.abhaykumar.navigationfragment.R
import com.abhaykumar.navigationfragment.databinding.FragmentFirstBinding
import com.abhaykumar.navigationfragment.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    private  var _binding: FragmentSecondBinding?=null
    private val binding get()=_binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding=FragmentSecondBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }
}