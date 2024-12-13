package controllers.actividad_1

import controllers.actividad_3.finalscan
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

fun main(){
    val scan = inicioscan()
    val preu = pedirPrecio(scan)
    val tipus = pedirTipoIva(scan)
    val data = pedirFecha(scan)
    calcularIva(preu,tipus, data)
    finalscan(scan)
}

fun inicioscan(): Scanner {
    return Scanner(System.`in`).useLocale(Locale.UK)
}

fun pedirPrecio (scan: Scanner):Float{
    val scan = inicioscan().useLocale(Locale.UK)
    println("Dime el precio de la compra para que te calcule el iva")
    val precio = scan.nextFloat()
    return precio
}
fun pedirFecha (scan:Scanner):LocalDate{
        println("Pon la fecha de la compra en formato DD-MM-YYYY:")
        val dateString = scan.nextLine()
        val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
        val localDate = LocalDate.parse(dateString, formatter)
    return localDate
}
fun pedirTipoIva (scan: Scanner):String{
    println("Dime el tipo de IVA que quieres aplicar: General, Reduida, Superrreduit, Exent")
    val tipoIva = scan.nextLine().lowercase()
    return tipoIva
}

fun calcularIva (preu:Float, tipus:String, data: LocalDate) {
    val resultado: Float
    val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
    when (tipus) {
        "Exent" -> println(preu)
        "superreduit" -> if (data in LocalDate.parse("01-01-1986", formatter)..LocalDate.parse(
                "01-01-1992", formatter)) {
            println("NO EXISTEIX")
        } else if (data in LocalDate.parse("01-01-1993", formatter)..LocalDate.parse("01-01-1995", formatter)) {
            resultado = preu * 0.03f
            println(resultado)
        } else if (data in LocalDate.parse("01-01-1995", formatter)..LocalDate.parse("01-01-3000", formatter)) {
            resultado = preu * 0.04f
            println(resultado + preu)
        } else {
            println("ERROR")
        }

        "reduido" -> if (data in LocalDate.parse("01-01-1986", formatter)..LocalDate.parse("01-01-1995", formatter)) {
            resultado = preu * 0.06f
            println(resultado + preu)
        } else if (data in LocalDate.parse("01-01-1995", formatter)..LocalDate.parse("01-01-2010", formatter)) {
            resultado = preu * 0.07f
            println(resultado + preu)
        } else if (data in LocalDate.parse("01-01-2010", formatter)..LocalDate.parse("15-07-2012", formatter)) {
            resultado = preu * 0.08f
            println(resultado + preu)
        } else if (data in LocalDate.parse("15-07-2012", formatter)..LocalDate.parse("01-01-3000", formatter))
        else {
            println("ERROR")
        }

        "general" -> if (data in LocalDate.parse("01-01-1986", formatter)..LocalDate.parse("01-01-1992", formatter)) {
            resultado = preu * 0.12f
            println(resultado + preu)
        } else if (data in LocalDate.parse("01-01-1992", formatter)..LocalDate.parse("01-01-1995", formatter)) {
            resultado = preu * 0.15f
            println(resultado + preu)
        } else if (data in LocalDate.parse("01-01-1995", formatter)..LocalDate.parse("01-01-2010", formatter)) {
            resultado = preu * 0.16f
            println(resultado + preu)
        } else if (data in LocalDate.parse("01-01-2010", formatter)..LocalDate.parse("15-07-2012", formatter)) {
            resultado = preu * 0.18f
            println(resultado + preu)
        } else if (data in LocalDate.parse("15-07-2012", formatter)..LocalDate.parse("01-01-3000", formatter)) {
            resultado = preu * 0.21f
            println(resultado + preu)
        } else {
            println("ERROR")
        }
    }
    fun finalscan(scan: Scanner) {
        scan.close()
    }
}
//no se pueden hacer tests porque mi funcion del calculo del iva no devuelve naday hay ciertos parametros del calculo que no se pueden modificar