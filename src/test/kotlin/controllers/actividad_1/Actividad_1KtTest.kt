package controllers.actividad_1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Actividad_1KtTest {

    @Test
    fun pedirPrecio() {
        var expected = 18.34
        assertEquals(expected, 18.34)
    }

    @Test
    fun pedirFecha() {
        var expected2= "02-02-1986"
        assertEquals(expected2, "02-02-1986")
    }

    @Test
    fun pedirTipoIva() {
        var expected3 = "general"
        assertEquals(expected3, "general")
    }

    @Test
    fun calcularIva() {
        var expected4 =20.5408
        assertEquals(expected4, 20.5408)
    }
}