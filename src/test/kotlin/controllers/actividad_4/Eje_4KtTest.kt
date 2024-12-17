package controllers.actividad_4

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Eje_4KtTest {

    @Test
    fun testMensajeCorto() {
        val mensaje = "Hola"
        val espaciosIzquierda = (80 - mensaje.length) / 2
        val espaciosDerecha = 80 - mensaje.length - espaciosIzquierda
        val esperado = " ".repeat(espaciosIzquierda) + mensaje + " ".repeat(espaciosDerecha)
        assertEquals(esperado, espacios(mensaje))
    }
    @Test
    fun testMensajeVacio() {
        val mensaje = ""
        val espaciosIzquierda = (80 - mensaje.length) / 2
        val espaciosDerecha = 80 - mensaje.length - espaciosIzquierda
        val esperado = " ".repeat(espaciosIzquierda) + "" + " ".repeat(espaciosDerecha)
        assertEquals(esperado, espacios(mensaje))
    }
    @Test
    fun testMensajeSoloEspacios() {
        val mensaje = "     "
        val espaciosIzquierda = (80 - mensaje.length) / 2
        val espaciosDerecha = 80 - mensaje.length - espaciosIzquierda
        val esperado = " ".repeat(espaciosIzquierda) + "     " + " ".repeat(espaciosDerecha)
        assertEquals(esperado, espacios(mensaje))
    }


}