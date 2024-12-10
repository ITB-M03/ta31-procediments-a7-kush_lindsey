package org.example.controllers

import java.util.*

fun main() {
    var scan = abrirScanner()
    var menu = menu(scan)
    var pila = crearArray()
    cerrarScanner(scan)
}
fun menu(scan: Scanner):Int {
    var seleccion : Int
    print("""
        *** Menu de opciones ***
      
        1. Agregar numero (push)
        2. Quitar numero (pop)
        3. Mostrar contenido de la pila
        4. Salir
        
        Seleccione la opcion que desee realizar:
    """.trimIndent())
    seleccion = scan.nextInt()
    return seleccion
}
fun crearArray(){
    var array = emptyArray<Int>()
}

fun añadirNumero(pila:Array<Int>){
    if (pila.size == 10){
        println("La pila esta llena")
    }
    else{

    }
}


/**
 * Funcion que abre el scanner
 * @author Lindsey Antunez
 * @version 1.0
 * @param scan Scanner
 */
fun abrirScanner() : Scanner {
    var scan : Scanner = Scanner(System.`in`)
    return scan
}
/**
 * Funcion que cierra el scanner
 * @author Lindsey Antunez
 * @version 1.0
 */
fun cerrarScanner(scan: Scanner) {
    scan.close()
}