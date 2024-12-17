import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

// Definimos la clase Pila y la función añadirNumero
class Pila {
    val pila = IntArray(10)
    var pos = 0
}

fun añadirNumero(num: Int, jugada: Pila): Boolean {
    var resultado: Boolean
    resultado = false
    // Para comprobar que la pila está llena la variable pos llega a valer 10
    if (jugada.pos == 10) {
        resultado = false
    } else {
        jugada.pila[jugada.pos] = num
        resultado = true
        jugada.pos++
    }
    return resultado
}

class PilaTest {

    private lateinit var pila: Pila

    @BeforeEach
    fun setUp() {
        pila = Pila()  // Inicializamos una nueva pila antes de cada test
    }

    @Test
    fun testAñadirNumeroDesdePilaIniciada() {
        pila.pos = 5
        val resultado = añadirNumero(5, pila)
        var esperadoPilaLlena = true
        var esperadoNumIntroducido = 5
        var esperadoPosSiguiente = 6

        assertEquals(esperadoPilaLlena, resultado)
        assertEquals(esperadoNumIntroducido, pila.pila[5])
        assertEquals(esperadoPosSiguiente, pila.pos)
    }

    @Test
    fun testAñadirNumeroPilaLlena() {
        pila.pos = 10
        var esperadoPilaLlena = false
        val resultado = añadirNumero(10, pila)
        assertEquals(esperadoPilaLlena, resultado)
    }

    @Test
    fun testAñadirNumeroEnPilaVacia() {
        // Test cuando la pila está vacía
        val resultado = añadirNumero(7, pila)
        var esperadoPilaLlena = true
        var esperadoNumIntroducido = 7
        var esperadoPosSiguiente = 1

        // Verificamos que la operación fue exitosa
        assertEquals(esperadoPilaLlena, resultado)
        assertEquals(esperadoNumIntroducido, pila.pila[0])
        assertEquals(esperadoPosSiguiente, pila.pos)
    }


    @Test
    fun eliminarNumero() {

    }

}
