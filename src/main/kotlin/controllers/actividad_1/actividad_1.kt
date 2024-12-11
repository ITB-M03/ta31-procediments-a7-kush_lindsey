package controllers.actividad_1

import controllers.actividad_3.mostrarResultado
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
fun main(){
    val scan = inicioscan()
    pedirFecha(scan)
    pedirTipoIva(scan)
    pedirPrecio(scan)
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

fun calcularIva (numero:Float, dia:Int, mes:Int, anyo:Int, tipoIva:String){
    val ivaGeneral :Float
    val ivaReduido : Float
    val ivaSuperreduido : Float
    val ivaExento : Float
    if (dia in 1..31 && mes in 1..12 && anyo in 1986..1992){
        if (tipoIva == "general"){
            ivaGeneral = numero * 0.12f
            println("${ivaGeneral+numero}")
        }
        if (tipoIva == "reduida"){
            ivaReduido = numero * 0.06f
            println("${ivaReduido+numero}")
        }
        if (tipoIva == "superreduit"){
            println("No Existeix")
        }
        if (tipoIva == "exento"){
            ivaExento = numero
            println("${ivaExento+numero}")
        }
    }
    else if (dia in 1..31 && mes in 1..12 && anyo in 1992..1993){
        if (tipoIva == "general"){
            ivaGeneral = numero * 0.15f
            println("${ivaGeneral+numero}")
        }
        if (tipoIva == "reduida"){
            ivaReduido = numero * 0.06f
            println("${ivaReduido+numero}")
        }
        if (tipoIva == "superreduit"){
            println("No Existeix")
        }
        if (tipoIva == "exento"){
            ivaExento = numero
            println("${ivaExento+numero}")
        }
    }
    else if (dia in 1..31 && mes in 1..12 && anyo in 1993..1995){
        if (tipoIva == "general"){
            ivaGeneral = numero * 0.15f
            println("${ivaGeneral+numero}")
        }
        if (tipoIva == "reduida"){
            ivaReduido = numero * 0.06f
            println("${ivaReduido+numero}")
        }
        if (tipoIva == "superreduit"){
            ivaSuperreduido = numero * 0.03f
            println("${ivaSuperreduido+numero}")
        }
        if (tipoIva == "exento"){
            ivaExento = numero
            println("${ivaExento+numero}")
        }
    }
    else if (dia in 1..31 && mes in 1..12 && anyo in 1995..2010){
        if (tipoIva == "general"){
            ivaGeneral = numero * 0.16f
            println("${ivaGeneral+numero}")
        }
        if (tipoIva == "reduida"){
            ivaReduido = numero * 0.07f
            println("${ivaReduido+numero}")
        }
        if (tipoIva == "superreduit"){
            ivaSuperreduido = numero * 0.04f
            println("${ivaSuperreduido+numero}")
        }
        if (tipoIva == "exento"){
            ivaExento = numero
            println("${ivaExento+numero}")
        }
    }
    else if (dia in 1..31 && mes in 1..12 && anyo in 2010..2012){
        if (tipoIva == "general"){
            ivaGeneral = numero * 0.18f
            println("${ivaGeneral+numero}")
        }
        if (tipoIva == "reduida"){
            ivaReduido = numero * 0.08f
            println("${ivaReduido+numero}")
        }
        if (tipoIva == "superreduit"){
            ivaSuperreduido = numero * 0.04f
            println("${ivaSuperreduido+numero}")
        }
        if (tipoIva == "exento"){
            ivaExento = numero
            println("${ivaExento+numero}")
        }
    }
    else if (dia in 17..31 && mes in 7..12 && anyo in 2012..3000){
        if (tipoIva == "general"){
            ivaGeneral = numero * 0.21f
            println("${ivaGeneral+numero}")
        }
        if (tipoIva == "reduida"){
            ivaReduido = numero * 0.10f
            println("${ivaReduido+numero}")
        }
        if (tipoIva == "superreduit"){
            ivaSuperreduido = numero * 0.04f
            println("${ivaSuperreduido+numero}")
        }
        if (tipoIva == "exento"){
            ivaExento = numero
            println("${ivaExento+numero}")
        }
    }
    else{
        println("ERROR")
    }
}

fun finalscan(scan: Scanner) {
    scan.close()
}