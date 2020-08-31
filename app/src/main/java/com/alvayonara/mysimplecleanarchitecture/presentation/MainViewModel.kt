package com.alvayonara.mysimplecleanarchitecture.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alvayonara.mysimplecleanarchitecture.domain.MessageEntity
import com.alvayonara.mysimplecleanarchitecture.domain.MessageUseCase

/**
 * ViewModel which will retrieve data from UseCase.
 */
class MainViewModel(private val messageUseCase: MessageUseCase) : ViewModel() {
    private val _message = MutableLiveData<MessageEntity>()
    val message: LiveData<MessageEntity>
        get() = _message

    fun setName(name: String) {
        _message.value = messageUseCase.getMessage(name)
    }
}