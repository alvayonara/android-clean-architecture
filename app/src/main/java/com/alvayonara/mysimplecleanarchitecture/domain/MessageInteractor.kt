package com.alvayonara.mysimplecleanarchitecture.domain

/**
 *
 * Class for Use Case.
 *
 * Kelas MessageInteractor extend ke kelas MessageUseCase dan meng-override fungsi sesuai dengan kebutuhan.
 * Lalu dapat dipanggil dari ViewModel.
 *
 * Menggunakan interface IMessageRepository pada constructor MessageInteractor,
 * karena ingin mengikuti dependency rule pada Clean Architecture.
 * Yaitu, Domain Layer tidak bergantung pada Data Layer.
 *
 * Nb: Jika langsung memanggil MessageRepository,
 * maka Class MessageInteractor akan tergantung pada implementasi MessageRepository.
 *
 * Jika Anda ingin mengubah MessageRepository dengan OtherMessageRepository,
 * maka Anda harus mengubah kode yang ada di MessageInteractor. Hal ini akan melanggar dependency rule.
 *
 * Domain layer tidak boleh bergantung data layer, tetapi harus bergantung pada abstraction.
 * Dalam hal ini, abstraction yang dibuat yaitu Interface bernama IMessageRepository.
 *
 * Data Layer-lah yang akan bergantung pada Domain Layer.
 * Sehingga dapat mengganti implementasi MessageRepository tanpa perlu mengubah kode pada domain Layer.
 * Kode pun jadi lebih mudah untuk dikembangkan ke depannya.
 *
 */
class MessageInteractor(private val messageRepository: IMessageRepository) : MessageUseCase {
    override fun getMessage(name: String): MessageEntity =
        messageRepository.getWelcomeMessage(name)
}