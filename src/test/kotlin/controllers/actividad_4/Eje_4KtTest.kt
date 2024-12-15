package controllers.actividad_4

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Eje_4KtTest {

    @Test
    fun espaciosCorrecto() {
        val mensaje = "Hola"
        val esperado = 80 - mensaje.length
        assertEquals(esperado, espacios(mensaje))
    }

}