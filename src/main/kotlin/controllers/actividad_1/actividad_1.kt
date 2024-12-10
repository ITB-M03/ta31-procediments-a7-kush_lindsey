package controllers.actividad_1

import java.util.*
fun main(){
    val scan= inicioscan().useLocale(Locale.UK)
    println("Dime el precio de la compra para que te calcule el iva")
    val numero = scan.nextFloat()
    println("Dime la data de tu compra")
    println("Dime el dia de tu compra")
    val dia = scan.nextInt()
    println("Dime el mes de tu compra")
    val mes = scan.nextInt()
    println("Dime el año de tu compra")
    val anyo = scan.nextInt()
    scan.nextLine()
    println("Dime el tipo de IVA que quieres aplicar: General, Reduida, Superrreduit, Exent")
    val tipoIva = scan.nextLine().lowercase()

    calcularIva(numero, dia, mes, anyo, tipoIva)
    finalscan(scan)
}

fun inicioscan(): Scanner {
    return Scanner(System.`in`).useLocale(Locale.UK)
}
fun datasCompra (dia: Int, mes: Int, anyo: Int): String{
    val data = Calendar.getInstance()
    val nDia = data.get(Calendar.DAY_OF_MONTH)
    val nMEs = data.get(Calendar.MONTH)
    val nAnyo = data.get(Calendar.YEAR)
    return "$nDia/$nMEs/$nAnyo"
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