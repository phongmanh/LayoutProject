package com.example.layoutproject

import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("backgroundColorByStatus")
fun setBackgroundByStatus(
    textView: TextView,
    orderStatus: ComboListSdk.ORDER_STATUS
) {
    val colorId = when (orderStatus) {
        ComboListSdk.ORDER_STATUS.WAIT_ACCEPT -> R.color.status_wait_to_accept
        ComboListSdk.ORDER_STATUS.WAIT_DELIVERY -> R.color.status_wait_to_delivery

        ComboListSdk.ORDER_STATUS.PAY_LATE -> R.color.status_pay_later
        ComboListSdk.ORDER_STATUS.WAIT_PAY -> R.color.status_wait_to_pay
        else -> R.color.status_received
    }
    textView.setBackgroundColor(colorId)
}