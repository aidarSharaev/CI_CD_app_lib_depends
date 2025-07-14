package com.example.cidishkaapplib

import org.junit.Assert.assertEquals
import org.junit.Test

class ExampleUnitTest {

    @Test
    fun check_lib() {
        val dope = Dope()

        val hello = dope.helloWorld()

        assertEquals("Hello", hello)
    }
}
