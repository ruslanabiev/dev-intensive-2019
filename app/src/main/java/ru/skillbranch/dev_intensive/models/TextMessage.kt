package ru.skillbranch.dev_intensive.models

import ru.skillbranch.dev_intensive.extensions.humanizeDiff
import java.util.*

class TextMessage(
    id: String,
    frome: User?,
    chat: Chat,
    isIncoming: Boolean = false,
    date: Date = Date(),
    var text: String?
) : BaseMessage(id,  frome,  chat, isIncoming, date) {

    override fun formatMessage(): String = "id $id ${frome?.firstName} " +
            "${if (isIncoming) "получил" else "отправил"} сообщение \"${text}\" ${date.humanizeDiff()}"
}