package com.example.unitconverterapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {

    var tempC by mutableIntStateOf(0)

    fun convertTemp(tempF: String){
        val tempFnum = tempF.toInt()
        tempC = ((tempFnum - 32) * 5/9)

    }

}