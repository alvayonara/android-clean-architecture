package com.alvayonara.mysimplecleanarchitecture.domain

/**
 *
 * Interface for Repository.
 * Bussiness process that will be called from Use Case.
 *
 */
interface IMessageRepository {
    fun getWelcomeMessage(name: String): MessageEntity
}