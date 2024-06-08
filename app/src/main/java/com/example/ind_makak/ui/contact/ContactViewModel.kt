package com.example.ind_makak.ui.contact

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ContactViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {

    }
    val text : LiveData<String> = _text
}