package controllers.actividad_4

import org.example.controllers.*
import java.util.*
fun main(){
    var scan = abrirScanner()
    var mensaje = pedirmensaje(scan)
    var resta = espacios(mensaje)
    mostrarResulado(resta, mensaje)

    cerrarScanner(scan)
}
fun pedirmensaje(scan: Scanner):String{
    var mensaje: String
    print("Ingresa un mensaje: ")
    mensaje = scan.nextLine()
    return mensaje
}
fun espacios(mensaje:String):Int{
    var resta : Int

    var longMensaje : Int = mensaje.length
    var caracteresPantalla : Int = 80

    resta = caracteresPantalla - longMensaje
   return resta
}
fun mostrarResulado(resta:Int,mensaje: String){
    for (i in 0 .. (resta/2)){
        print(" ")
    }
    print(mensaje)
    for (i in 0 .. resta/2){
        print(" ")
    }
}

