package com.alvayonara.mysimplecleanarchitecture.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alvayonara.mysimplecleanarchitecture.domain.MessageEntity
import com.alvayonara.mysimplecleanarchitecture.domain.MessageUseCase

/**
 *
 * ViewModel which will retrieve data from UseCase.
 * Memanggil fungsi getMessage() dari class MessageInteractor di ViewModel.
 *
 * ==========================================================================================================================
 *
 * FAQ:
 * T : Mengapa kita tidak langsung saja memanggil Repository dari Presenter/ViewModel?
 * J : Hal ini karena kita ingin menghindari God Object pada layer tersebut dengan beban tanggung jawab dan fungsi yang besar
 * untuk meng-handle penggabungan logika proses bisnis aplikasi, tampilan dan logika aliran data dari dan ke repository terkait.
 *
 * T : Bagaimana hubungan UseCase dengan ViewModel/Presenter?
 * J : Hubungan antara UseCase dengan ViewModel/Presenter tergantung seberapa banyak proses bisnis yang akan dieksekusi pada layer UI
 * jadi bisa dibilang hubungan antar keduanya bersifat komposisi one to many.
 *
 * T : Mengapa perlu membuat Use Case jika isinya hanya meneruskan memanggil Repository?
 * J : Karena kita ingin konsistensi dari struktur kode aplikasi dengan mendistribusikan tanggung jawab sesuai dengan
 * kemampuan masing-masing layerjika merujuk pada pendekatan clean architecture.
 *
 * ==========================================================================================================================
 *
 */
class MainViewModel(private val messageUseCase: MessageUseCase) : ViewModel() {
    private val _message = MutableLiveData<MessageEntity>()
    val message: LiveData<MessageEntity>
        get() = _message

    fun setName(name: String) {
        _message.value = messageUseCase.getMessage(name)
    }
}