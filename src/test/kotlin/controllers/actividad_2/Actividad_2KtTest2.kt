package controllers.actividad_2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Actividad_2KtTest2 {

    @Test
    fun roman() {
        var expected = "MMDCCLVI"
        assertEquals(expected, roman(2756))
    }
}