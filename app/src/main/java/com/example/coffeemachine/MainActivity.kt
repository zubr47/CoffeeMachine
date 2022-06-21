package com.example.coffeemachine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import com.example.coffeemachine.databinding.ActivityMainBinding
var status = Status()

class MainActivity : AppCompatActivity() {
    private val dataModel: DataModel by viewModels()
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        openFragment(R.id.place_holder, BlankMachine.newInstance())

        binding.BottomNavi.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.buy ->  openFragment(R.id.place_holder, BlankMachine.newInstance())
                R.id.take ->  openFragment(R.id.place_holder,FragmentTake.newInstance())
                R.id.fill -> ""
                R.id.remaining ->  openFragment(R.id.place_holder,FragmentRemaining.newInstance())
            }
            true
        }
    }
    private fun openFragment(idHolder: Int, f : Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(idHolder, f).commit()
    }

}