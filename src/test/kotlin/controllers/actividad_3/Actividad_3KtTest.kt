package controllers.actividad_3

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
 class Actividad_3KtTest {

@Test
 fun validarSuperUsuari() {
  val expected = true
 assertEquals(expected, validarSuperUsuari("holaSantiYDani"))
 }
}