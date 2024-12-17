import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*


fun eliminarNumero(jugada: Pila): Boolean {
 var resultado: Boolean
 resultado = false
 if (jugada.pos == -1) {
  resultado = false // La pila está vacía y no se puede eliminar
 } else {
  resultado = true // La pila no está vacía, se puede eliminar
 }
 return resultado
}

class EliminarNumeroTest {

 private lateinit var pila: Pila

 @BeforeEach
 fun setUp() {
  pila = Pila()  // Inicializamos una nueva pila antes de cada test
 }

 @Test
 fun testEliminarNumeroPilaVacia() {
  pila.pos = -1
  var resultado = eliminarNumero(pila)
  // false pila  vacía
  assertFalse(resultado)
 }

 @Test
 fun testEliminarNumeroPilaConElementos() {
  pila.pos = 5
  var resultado = eliminarNumero(pila)
  //  true pila no está vacía
  assertTrue(resultado)
 }

 @Test
 fun testEliminarNumeroConPosicionCero() {
  pila.pos = 0
  var resultado = eliminarNumero(pila)
  //  true pila no está vacía
  assertTrue(resultado)
 }

}
