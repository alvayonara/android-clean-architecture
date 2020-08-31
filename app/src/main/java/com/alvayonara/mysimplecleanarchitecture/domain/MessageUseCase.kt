package com.alvayonara.mysimplecleanarchitecture.domain

/**
 *
 * Abstract class as base from all Use Cases.
 *
 * Sebagai kode induk dari Interactor yang akan didefinisikan.
 * Hubungan antara ViewModel/Presenter dengan seharusnya bukan concrete class ke concrete class,
 * namun ke concrete class ke abstract class.
 *
 * Implementasi interface ini pada kelas MessageInteractor
 *
 */
interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}