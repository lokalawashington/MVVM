package com.washingtoncodelab.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel (){
    private val _result = MutableLiveData<Int>()
    val result : LiveData<Int>
    get() = _result

    public fun addTwonNums(num1: Int,num2: Int){
        _result.value = num1 + num2
    }
}