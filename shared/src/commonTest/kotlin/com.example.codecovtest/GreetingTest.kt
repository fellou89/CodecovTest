package com.example.codecovtest

import kotlin.test.Test
import kotlin.test.assertTrue

class GreetingTest {
    @Test
    fun testExample() {
        assertTrue(Greeting("test","another") != null)
    }
}