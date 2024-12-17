package controllers.actividad_4

import org.example.controllers.*
import java.util.*
/**
 * Programa que centra un mensaje en una pantalla de tamaño de 80 caracteres
 * @param scan Scanner para leer por teclado
 * @param mensaje variable que guarda el mensaje que escribio el usuario
 * @author Lindsey Antunez
 * @version 1.0
 */
fun main(){
    var scan = abrirScanner()
    var mensaje = pedirmensaje(scan)
    println(espacios(mensaje))
    cerrarScanner(scan)
}

/**
 * funcion que solicita al usuario ingresar un mensaje
 *
 * @param scan Scanner utilizado para leer el mensaje del usuario.
 * @return mensaje texto ingresado
 */
fun pedirmensaje(scan: Scanner):String{
    var mensaje: String
    print("Ingresa un mensaje: ")
    mensaje = scan.nextLine()
    return mensaje
}

/**
 * centra el mensaje agregando espacios a la izquierda
 * y derecha
 *
 * @param mensaje mensaje que se desea centrar.
 * @return cadena con el mensaje centrado con espacios a los lados.
 */
fun espacios(mensaje: String): String {
    var resultado : String
    val espaciosIzquierda = (80 - mensaje.length) / 2
    val espaciosDerecha = 80 - mensaje.length - espaciosIzquierda
    resultado = " ".repeat(espaciosIzquierda) + mensaje + " ".repeat(espaciosDerecha)
    return resultado
}

