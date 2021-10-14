package com.example.codecovtest

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Greeting (
    @SerialName("json field") val test: String,
    val another: String

//    fun greeting(): String {
//        return "Hello, ${Platform().platform}!"
//    }
)