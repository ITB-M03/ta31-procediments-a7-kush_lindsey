package controllers.actividad_2

import java.util.*
//insertar un numero que te lo devuelva en numeros romanos
//I= 1, V=5, X=10, L=50, C=100, D=500, M=1000
fun main(){
    val scan  = inicioscan()
    val numero = pedirNumero("Introduce un Numero del 1 al 3999:", scan)
    val numeroRomano = roman(numero)
    pantalla(numeroRomano)
    finalscan(scan)
}

fun inicioscan(): Scanner {
    return Scanner(System.`in`).useLocale(Locale.UK)
}
fun pedirNumero(msg: String, scan: Scanner): Int {
    print(msg)

    val num: Int = scan.nextInt()

    return num
}

fun roman(num: Int): String {
    val numeroRomano = listOf(
        "M" to 1000,
        "CM" to 900,
        "D" to 500,
        "CD" to 400,
        "C" to 100,
        "XC" to 90,
        "L" to 50,
        "XL" to 40,
        "X" to 10,
        "IX" to 9,
        "V" to 5,
        "IV" to 4,
        "I" to 1
    )
    var resultado = ""

    var resto = num
    for (i in numeroRomano) {
        while (resto >= i.second) {
            resultado += i.first
            resto -= i.second
        }
    }

    return resultado
}
fun pantalla (numero: String) {
    println("EL numero en Romano es: $numero")
}

fun finalscan(scan: Scanner) {
    scan.close()
}


