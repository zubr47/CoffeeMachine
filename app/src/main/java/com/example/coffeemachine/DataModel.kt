package com.example.coffeemachine

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class DataModel: ViewModel() {
    val message : MutableLiveData<Machine> by lazy {
        MutableLiveData<Machine>()
    }
}