package controllers.actividad_2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Actividad_2KtTest3 {

    @Test
    fun roman() {
        var expected = "MMMXCIX"
        assertEquals(expected, roman(3099))
    }
}