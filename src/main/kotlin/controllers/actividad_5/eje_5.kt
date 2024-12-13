package org.example.controllers

import java.awt.Menu
import java.util.*

/**
 * Programa que muestran un menu en el que da tres opciones las cuales consisten en agregar o eliminar un numero
 * y mostar la lista donde se guardan los numeros introducidos
 * @author Lindsey Antunez
 * @version 1.0
 * @param scan Scanner
 * @param menu variable que guarda la seleccion del usuario en del menu
 * @param pila donde se guarda la lista que se creó anteriormente
 * @param pos variable que dice la posicion del rray
 */
fun main() {
    var scan = abrirScanner()
    var pos = -1
    var menu = menu(scan)
    var pila = crearArray()
    gestionMenu(pos,scan,pila,menu)
    cerrarScanner(scan)
}
data class Pila (
    var pos: Int,
    var pila: Array<Int>,
    var seleccion: Int
)


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
fun gestionMenu(pos: Int, scan: Scanner, pila: Array<Int>, menu: Int){
    var jugada : Pila = Pila(-1,pila,menu)
    while (jugada.seleccion != 4) {
        //Menu = 1 selecciona la opcion de añadir un numero lo que llama a la correspondiente funcion
        if (jugada.seleccion == 1) {
            opcion1(jugada, scan)
            //Menu = 2 elimina un numero por lo que se llama a la funcion correspondiente
        } else if (jugada.seleccion == 2) {
            opcion2(jugada)

        } else if (jugada.seleccion == 3) {
            opcion3(jugada)
        }
        jugada.seleccion = menu(scan)
    }
}
fun opcion1(jugada:Pila,scan: Scanner){
    //pide el numero
    print("Introduzca el numero que desea añadir: ")
    var num = scan.nextInt()
    //En caso de que aún este en el límite la posicion se incrementa
    if (jugada.pos <= 9) {
        jugada.pos++
    }
    //la funcion devuelve true o false, si es false es porque añadio el numero
    if (añadirNumero(num, jugada) == true) {
        println("Numero añadido")
    }
    //de lo contrario la pila esta llena
    else {
        println("Pila llena")
    }

}

fun opcion2(jugada: Pila){
    //En caso de que se haya llenado la pila se tiene que comprobar que pos valga menos que nueve y si no es
    // asi se le asigna el valor 9 que es el maximo que puede tener
    if (jugada.pos > 9) jugada.pos = 9
    if (eliminarNumero(jugada) == false) {
        println("La pila esta vacia, no puede eliminar ningun numero.")
    } else if (eliminarNumero(jugada) == true) {
        println("Numero eliminado")
        jugada.pos--
    }
}
fun opcion3(jugada: Pila){
    //En el caso de que se pos sea mayor que el límite del array el valor de pos pasara a ser 9 que es el limite
    if (jugada.pos > 9)jugada.pos = 9
    muestraLista(jugada)
}

/**
 * Funcion que crea la lista en la que se guardaran los numero
 * @author Lindsey Antunez
 * @return lista Es la lista vacia en la que se introduciran los numeros
 */
fun crearArray(): Array<Int> {
    var tamañoArray = 10
    var pila = Array<Int>(tamañoArray) { 0 }
    return pila
}

/**
 * Funcion con la que se añade un numero a la lista
 * @author Lindsey Antunez
 * @param pila array donde añadira el numero
 * @param num numero que va a añadir
 */
fun añadirNumero(num: Int, jugada: Pila): Boolean {
    var resultado: Boolean
    resultado = false
    //Para comprobar que la pila esta llena la variable pos llega a valer 10 y cuando eso pasa se devuelve false porque la pila esta llena
    if (jugada.pos == 10) {
        resultado = false
    } else {
        jugada.pila[jugada.pos] = num
        resultado = true
    }
    return resultado
}

/**
 * Funcion que elimina el ultimo numero que se introdujo, en el caso de que este vacia muestra
 * un mensaje informando que esta vacia y no se puede eliminar ningun numero
 * @author Lindsey Antunez
 * @param pila lista de donde eliminara el numero
 */
fun eliminarNumero(jugada: Pila): Boolean {
    var resultado: Boolean
    resultado = false
    if (jugada.pos == -1) {
        resultado = false
    } else {
        resultado = true
    }
    return resultado
}

/**
 * Funcion que muestra la lista empezando por el ultimo numero hasta el primero
 * @author Lindsey Antunez
 * @param pila lista que se muestra por pantalla
 * Esta funcion solo muestra la lista por lo que no es necesario probarla
 */
fun muestraLista(jugada: Pila) {
    for (i in jugada.pos downTo 0) {
        print("${jugada.pila[i]}, ")

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