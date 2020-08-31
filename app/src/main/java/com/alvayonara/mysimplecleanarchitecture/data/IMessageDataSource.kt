package com.alvayonara.mysimplecleanarchitecture.data

import com.alvayonara.mysimplecleanarchitecture.domain.MessageEntity

/**
 * Interface for DataSource.
 */
interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}