package controllers.actividad_2

import java.util.*
//insertar un numero que te lo devuelva en numeros romanos
//I= 1, V=5, X=10, L=50, C=100, D=500, M=1000
fun main(){
    val scan = inicioscan()
    val pedirNum = pedirNumero(scan)
    roman(pedirNum)
    finalscan(scan)
}

fun inicioscan(): Scanner {
    return Scanner(System.`in`).useLocale(Locale.UK)
}
fun pedirNumero (scan: Scanner):Int{
    val scan = Scanner(System.`in`)
    val numero = scan.nextInt()
    return numero
}
fun roman(numero:Int):String{

return numero.toString()
}

fun finalscan(scan: Scanner) {
    scan.close()
}
