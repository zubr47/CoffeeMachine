package com.example.coffeemachine

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.coffeemachine.databinding.FragmentFillBinding


class FragmentFill : Fragment() {
    lateinit var binding: FragmentFillBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFillBinding.inflate(inflater)
        // Inflate the layout for this fragment
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.bRefill.setOnClickListener() {
           refill()
        }
    }

          private fun refill() {
              if (!isEmpty(binding.addWater))
          status.water += binding.addWater.text.toString().toInt()
              if (!isEmpty(binding.addBeans))
          status.coffeeBeans += binding.addBeans.text.toString().toInt()
              if (!isEmpty(binding.addMilk))
          status.milk += binding.addMilk.text.toString().toInt()
              if (!isEmpty(binding.addCups))
          status.disposableCups += binding.addCups.text.toString().toInt()
      }
    private fun isEmpty(etText: EditText): Boolean {
        return etText.text.toString().trim { it <= ' ' }.length <= 0
    }
    companion object {
        fun newInstance() = FragmentFill()
                }
            }
