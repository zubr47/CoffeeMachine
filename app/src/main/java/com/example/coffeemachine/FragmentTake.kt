package com.example.coffeemachine

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.coffeemachine.databinding.FragmentTakeBinding

class FragmentTake : Fragment() {
    lateinit var binding: FragmentTakeBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentTakeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.button.setOnClickListener() {
            checkPass()
        }
    }


    companion object {
        @JvmStatic fun newInstance() = FragmentTake()
    }
    fun checkPass() {
        if (binding.textPassword.text != null && binding.textPassword.text.toString() == status.password) {
            val res = "you took  ${status.money} $"
            binding.tvRes.text = res
            binding.tvRes.visibility = View.VISIBLE
            status.money = 0
        } else {
            binding.tvRes.visibility = View.VISIBLE
            binding.tvRes.text = "wrong password"
        }
    }
    }
