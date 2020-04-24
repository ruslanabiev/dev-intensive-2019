package ru.skillbranch.devintensive.extensions

import android.app.Activity
import android.graphics.Rect
import kotlinx.android.synthetic.main.activity_main.*

fun Activity.isKeyboardOpen(): Boolean {

    val r = Rect()

    activityRoot.getWindowVisibleDisplayFrame(r)

    val screenHeight: Int = activityRoot.rootView.height
    val keypadHeight = screenHeight - r.bottom

    return (keypadHeight > screenHeight * 0.15)
}