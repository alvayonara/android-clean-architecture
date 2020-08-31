package com.alvayonara.mysimplecleanarchitecture.data

import com.alvayonara.mysimplecleanarchitecture.domain.IMessageRepository
import com.alvayonara.mysimplecleanarchitecture.domain.MessageEntity

/**
 * Repository class, which extends from the IMessageRepository class in the Domain package.
 * This class will set the datasource to be assigned to the Use Case.
 */
class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity =
        messageDataSource.getMessageFromSource(name)
}