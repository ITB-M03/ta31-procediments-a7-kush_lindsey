package controllers.actividad_4

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Eje_4KtTest {

    @Test
    fun espaciosCorrecto() {
        var mensaje = "Hola"
        var esperado = " ".repeat(80 -((mensaje.length)/2)) + mensaje + " ".repeat(80 -((mensaje.length)/2))
        assertEquals(esperado, espacios(mensaje))
    }

}