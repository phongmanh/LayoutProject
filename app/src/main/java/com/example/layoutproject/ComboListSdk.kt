package com.example.layoutproject

import android.content.Context
import android.text.Spannable
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.text.style.UnderlineSpan
import androidx.core.content.ContextCompat
import androidx.core.text.toSpannable

object ComboListSdk {

    enum class STATUS{
        WAIT_ACCEPT,
        WAIT_DELIVERY,
        PAY_LATE,
        RECEIVED,
        WAIT_PAY
    }

    object UIHelper {

        @JvmStatic
        fun getQuestionDisplay(context: Context): Spannable {
            val prefix = context.getString(R.string.combo_list_question)
            val suffix = context.getString(R.string.combo_list_verify_text)

            val displayPrefix = SpannableString(prefix).apply {
                setSpan(
                    ForegroundColorSpan(ContextCompat.getColor(context, R.color.text_black)),
                    0,
                    prefix.length,
                    Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                )
            }
            val displaySuffix = SpannableString(suffix).apply {
                setSpan(
                    ForegroundColorSpan(ContextCompat.getColor(context, R.color.colorPrimary)),
                    0,
                    prefix.length,
                    Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                )
                setSpan(UnderlineSpan(), 0, prefix.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            }
            return SpannableStringBuilder(displayPrefix).append(displaySuffix).toSpannable()
        }

    }

}