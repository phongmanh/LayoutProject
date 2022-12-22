package com.example.layoutproject

import java.text.NumberFormat


fun Int.toPrice(): String = NumberFormat.getInstance().format(this)