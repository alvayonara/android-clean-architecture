package com.alvayonara.mysimplecleanarchitecture.data

import com.alvayonara.mysimplecleanarchitecture.domain.MessageEntity

/**
 * Implementation DataSource.
 */
class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String): MessageEntity =
        MessageEntity("Hello $name! Welcome to Clean Architecture")
}