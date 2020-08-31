package com.alvayonara.mysimplecleanarchitecture.domain

import com.alvayonara.mysimplecleanarchitecture.data.MessageRepository
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.junit.MockitoJUnitRunner

/**
 *
 * Kelas yang ada di Domain Layer ini tidak tergantung dengan layer lainnya,
 * sehingga dapat membuat testing menjadi lebih mudah.
 *
 */
@RunWith(MockitoJUnitRunner::class)
class MessageUseCaseTest {

    private lateinit var messageUseCase: MessageUseCase

    @Mock private lateinit var messageRepository: MessageRepository

    @Before
    fun setUp() {
        messageUseCase = MessageInteractor(messageRepository)
        val dummyMessage = MessageEntity("Hello $NAME Welcome to Clean Architecture")
        `when`(messageRepository.getWelcomeMessage(NAME)).thenReturn(dummyMessage)
    }

    // Mencoba menjalankan fungsi di dalam MessageUseCase dan memeriksa fungsi dan argument yang dimasukkan.
    @Test fun `should get data from repository`() {
        messageUseCase.getMessage(NAME)

        verify(messageRepository).getWelcomeMessage(NAME)

        // Memastikan semua interaksi sudah di-verify.
        // Fungsi ini akan membuat test gagal jika ada interaksi yang belum di-verify.
        verifyNoMoreInteractions(messageRepository)
    }

    companion object {
        const val NAME = "Dicoding"
    }
}