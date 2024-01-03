package com.example.loveapi

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.loveapi.model.LoveModel

class LoveViewModel : ViewModel() {

    private val repository = Repository()

    fun getLoveLiveData(firstName: String, secondName: String): LiveData<LoveModel> {
        return repository.getData(firstName, secondName)
    }
}