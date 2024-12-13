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




    cerrarScanner(scan)
}
data class Pila (
    var pos: Int,
    var pila: Array<Int>,
    var tamano: Int
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

    while (menu != 4) {
        //Menu = 1 selecciona la opcion de añadir un numero lo que llama a la correspondiente funcion
        if (menu == 1) {
            opcion1(scan, pos,pila)
            //Menu = 2 elimina un numero por lo que se llama a la funcion correspondiente
        } else if (menu == 2) {
            opcion2(pos, pila)

        } else if (menu == 3) {
            opcion3(pos, pila)
        }
        menu = menu(scan)
    }
}
fun opcion1(scan: Scanner, pos: Int, pila: Array<Int>):Int{
    var pos:Int = pos
    //pide el numero
    print("Introduzca el numero que desea añadir: ")
    var num = scan.nextInt()
    //En caso de que aún este en el límite la posicion se incrementa
    if (pos <= 9) {
        pos++
    }
    //la funcion devuelve true o false, si es false es porque añadio el numero
    if (añadirNumero(pila, num, pos) == true) {
        println("Numero añadido")
    }
    //de lo contrario la pila esta llena
    else {
        println("Pila llena")
    }
    return pos
}

fun opcion2(pos: Int, pila: Array<Int>):Int{
    var pos:Int = pos
    //En caso de que se haya llenado la pila se tiene que comprobar que pos valga menos que nueve y si no es
    // asi se le asigna el valor 9 que es el maximo que puede tener
    if (pos > 9) pos = 9
    //Si pos es mayor o igual que 0 significa que hay por lo menos 1 elemento que se puede borrar
    if (pos >= 0) {
        Pila.
    }
    if (eliminarNumero(pila, pos) == false) {
        println("La pila esta vacia, no puede eliminar ningun numero.")
    } else if (eliminarNumero(pila, pos) == true) {
        println("Numero eliminado")
    }
    return pos
}
fun opcion3(pos: Int, pila: Array<Int>):Int{
    var pos :Int = pos
    //En el caso de que se pos sea mayor que el límite del array el valor de pos pasara a ser 9 que es el limite
    if (pos > 9) pos = 9
    muestraLista(pila, pos)
    return pos
}

/**
 * Funcion que crea la lista en la que se guardaran los numero
 * @author Lindsey Antunez
 * @return lista Es la lista vacia en la que se introduciran los numeros
 */
fun crearArray(): Array<Int> {
    var tamañoArray = 10
    var pila:Pila= Array<Int>(tamañoArray) { 0 }
    return array
}

/**
 * Funcion con la que se añade un numero a la lista
 * @author Lindsey Antunez
 * @param pila array donde añadira el numero
 * @param num numero que va a añadir
 */
fun añadirNumero(pila: Array<Int>, num: Int, pos: Int): Boolean {
    var resultado: Boolean
    resultado = false
    //Para comprobar que la pila esta llena la variable pos llega a valer 10 y cuando eso pasa se devuelve false porque la pila esta llena
    if (pos == 10) {
        resultado = false
    } else {
        pila[pos] = num
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
fun eliminarNumero(pila: Array<Int>, pos: Int): Boolean {
    var resultado: Boolean
    resultado = false
    if (pos == -1) {
        resultado = false
    } else {
        var numeroBorrado = pila[pos + 1]
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