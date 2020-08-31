package com.alvayonara.mysimplecleanarchitecture.domain

/**
 *
 * Class for Use Case.
 *
 */
class MessageInteractor(private val messageRepository: IMessageRepository) : MessageUseCase {
    override fun getMessage(name: String): MessageEntity =
        messageRepository.getWelcomeMessage(name)
}