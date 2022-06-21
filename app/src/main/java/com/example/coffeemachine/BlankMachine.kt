package com.example.coffeemachine

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.coffeemachine.databinding.FragmentBlankMachineBinding
import java.util.*
import kotlin.concurrent.schedule


class BlankMachine : Fragment() {

    lateinit var binding: FragmentBlankMachineBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        binding = FragmentBlankMachineBinding.inflate(inflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.buttonEspresso.setOnClickListener() {
            Machine.buy(Machine.ESPRESSO)
            display(Machine.status_message)
        }
        binding.buttonCappuccino.setOnClickListener() {
            Machine.buy(Machine.CAPPUCCINO)
            display(Machine.status_message)
        }
        binding.buttonLatte.setOnClickListener() {
            Machine.buy(Machine.LATTE)
            display(Machine.status_message)
        }
    }

     private fun display(message: String) {
         binding.tvDisplay.text = message
         Timer().schedule(2000L){
             binding.tvDisplay.text = "Ready"
         }
     }

    companion object {
        fun newInstance() =BlankMachine()
    }
    }
