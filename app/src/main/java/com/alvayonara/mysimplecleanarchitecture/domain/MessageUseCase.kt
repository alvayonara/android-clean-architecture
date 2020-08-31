package com.alvayonara.mysimplecleanarchitecture.domain

/**
 *
 * Abstract class as base from all Use Cases.
 *
 */
interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}