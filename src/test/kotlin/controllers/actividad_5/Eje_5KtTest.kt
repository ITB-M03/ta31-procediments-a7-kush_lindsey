package controllers.actividad_5

import org.example.controllers.crearArray
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
 class Eje_5KtTest {

@Test
 fun crearArrayTest() {
 var esperado = Array<Int>(10) { 0 }
 kotlin.test.assertEquals(esperado, crearArray())
 }
}