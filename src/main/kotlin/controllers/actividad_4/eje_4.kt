package controllers.actividad_4

import org.example.controllers.*
import java.util.*
fun main(){
    var scan = abrirScanner()
    var mensaje = pedirmensaje(scan)
    espacios(mensaje)
    cerrarScanner(scan)
}
fun pedirmensaje(scan: Scanner):String{
    var mensaje: String
    print("Ingresa un mensaje: ")
    mensaje = scan.nextLine()
    return mensaje
}
fun espacios(mensaje:String){
    var longMensaje : Int = mensaje.length
    var caracteresPantalla : Int = 80

    var resta = caracteresPantalla - longMensaje
    for (i in 0 .. (resta/2)){
        print(" ")
    }
    print(mensaje)
    for (i in 0 .. resta/2){
        print(" ")
    }


}

