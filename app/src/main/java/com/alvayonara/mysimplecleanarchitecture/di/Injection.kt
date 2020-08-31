package com.alvayonara.mysimplecleanarchitecture.di

import com.alvayonara.mysimplecleanarchitecture.data.IMessageDataSource
import com.alvayonara.mysimplecleanarchitecture.data.MessageDataSource
import com.alvayonara.mysimplecleanarchitecture.data.MessageRepository
import com.alvayonara.mysimplecleanarchitecture.domain.IMessageRepository
import com.alvayonara.mysimplecleanarchitecture.domain.MessageInteractor
import com.alvayonara.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource =
        MessageDataSource()
}