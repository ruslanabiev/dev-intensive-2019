package ru.skillbranch.dev_intensive.models

import ru.skillbranch.dev_intensive.extensions.humanizeDiff
import java.util.*

class ImageMessage(
    id: String,
    frome: User?,
    chat: Chat,
    isIncoming: Boolean = false,
    date: Date = Date(),
    var image: String

) : BaseMessage(
    id,
    frome,
    chat,
    isIncoming,
    date
) {

    override fun formatMessage(): String = "id $id ${frome?.firstName} " +
            "${if (isIncoming) "получил" else "отправил"} изображение, \"${image}\" ${date.humanizeDiff()}"
}