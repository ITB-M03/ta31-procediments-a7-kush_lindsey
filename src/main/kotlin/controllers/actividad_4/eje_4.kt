package controllers.actividad_4

import org.example.controllers.*
import java.util.*
fun main(){
    var scan = abrirScanner()
    var mensaje = pedirmensaje(scan)
    println(espacios(mensaje))


    cerrarScanner(scan)
}
fun pedirmensaje(scan: Scanner):String{
    var mensaje: String
    print("Ingresa un mensaje: ")
    mensaje = scan.nextLine()
    return mensaje
}
fun espacios(mensaje: String): String {
    val espaciosIzquierda = (80 - mensaje.length) / 2
    val espaciosDerecha = 80 - mensaje.length - espaciosIzquierda
    return " ".repeat(espaciosIzquierda) + mensaje + " ".repeat(espaciosDerecha)
}

