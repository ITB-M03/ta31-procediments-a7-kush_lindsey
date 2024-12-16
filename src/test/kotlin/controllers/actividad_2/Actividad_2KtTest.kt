package controllers.actividad_2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Actividad_2KtTest {

    @Test
    fun roman() {
        var expected = "C"
        assertEquals(expected, roman(100))
    }
}