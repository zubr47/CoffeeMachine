package com.example.coffeemachine

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.coffeemachine.databinding.FragmentBlankMachineBinding
import com.example.coffeemachine.databinding.FragmentRemainigBinding

class FragmentRemaining : Fragment() {
    val cups = "disposableCups ${status.disposableCups}"
    val coffebeans  = "coffebeans ${status.coffeeBeans}"
    val milk   = "milk  ${status.milk}"
    val water    = "water  ${status.water}"
    lateinit var binding: FragmentRemainigBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRemainigBinding.inflate(inflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.tvBeans.text = coffebeans
        binding.tvCups.text = cups
        binding.tvMilk.text = milk
        binding.tvWater.text = water
    }

    companion object {

        fun newInstance() =
            FragmentRemaining()
                }
            }
