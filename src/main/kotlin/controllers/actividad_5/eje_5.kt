package org.example.controllers

import java.util.*

/**
 * Programa que muestran un menu en el que da tres opciones las cuales consisten en agregar o eliminar un numero
 * y mostar la lista donde se guardan los numeros introducidos
 * @author Lindsey Antunez
 * @version 1.0
 * @param scan Scanner
 * @param menu variable que guarda la seleccion del usuario en del menu
 * @param pila donde se guarda la lista que se creo
 */
fun main() {
    var scan = abrirScanner()
    var menu = menu(scan)
    var pila = crearArray()
    var pos = -1
    while (menu != 4) {

        if (menu == 1) {
            print("Introduzca el numero que desea añadir: ")
            var num = scan.nextInt()
            if (pos < 9) {
                pos++
            }
            añadirNumero(pila, num, pos)
        } else if (menu == 2) {
            if (pos >= 0) pos--
            eliminarNumero(pila, pos)

        } else if (menu == 3) {
            muestraLista(pila, pos)
        }
        menu = menu(scan)
    }
    cerrarScanner(scan)
}

/**
 * Menu donde se muestran las opciones que ofrece el programa
 * @author Lindsey Antunez
 * @return seleccion variable de tipo entero que guarda la opcion que selecciono el usuario.
 *
 */
fun menu(scan: Scanner): Int {
    var seleccion: Int
    print(
        """
        *** Menu de opciones ***
      
        1. Agregar numero (push)
        2. Quitar numero (pop)
        3. Mostrar contenido de la pila
        4. Salir
        
        Seleccione la opcion que desee realizar:
    """.trimIndent()
    )
    seleccion = scan.nextInt()
    return seleccion
}

/**
 * Funcion que crea la lista en la que se guardaran los numero
 * @author Lindsey Antunez
 * @return lista Es la lista vacia en la que se introduciran los numeros
 */
fun crearArray(): Array<Int> {
    var tamañoArray = 10
    var array = Array<Int>(tamañoArray) { 0 }
    return array
}

/**
 * Funcion con la que se añade un numero a la lista
 * @author Lindsey Antunez
 * @param pila array donde añadira el numero
 * @param num numero que va a añadir
 */
fun añadirNumero(pila: Array<Int>, num: Int, pos: Int) {
    if (pos > 9) {
        println("La pila esta llena")
    } else {
        pila[pos] = num
    }
}

/**
 * Funcion que elimina el ultimo numero que se introdujo, en el caso de que este vacia muestra
 * un mensaje informando que esta vacia y no se puede eliminar ningun numero
 * @author Lindsey Antunez
 * @param pila lista de donde eliminara el numero
 */
fun eliminarNumero(pila: Array<Int>, pos:Int) {
    if (pos == -1) {
        println("La pila esta vacia, no puede eliminar ningun numero.")
    }
    else {
        var numeroBorrado = pila[pos+1]
        println("Se borro el numero $numeroBorrado")
    }
}

/**
 * Funcion que muestra la lista empezando por el ultimo numero hasta el primero
 * @author Lindsey Antunez
 * @param pila lista que se muestra por pantalla
 */
fun muestraLista(pila: Array<Int>, pos: Int) {
    for (i in pos downTo 0) {
        print("${pila[i]}, ")

    }
}


/**
 * Funcion que abre el scanner
 * @author Lindsey Antunez
 * @version 1.0
 * @param scan Scanner
 */
fun abrirScanner(): Scanner {
    var scan: Scanner = Scanner(System.`in`)
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