package controllers.actividad_3

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
 class Actividad_3KtTest2 {

@Test
 fun validarSuperUsuari() {
  val expected = false
 assertEquals(expected, validarSuperUsuari("españoles"))
 }
}