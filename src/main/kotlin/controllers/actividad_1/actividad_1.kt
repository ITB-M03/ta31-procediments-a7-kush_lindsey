package controllers.actividad_1
/*hacer un programa sobre el calculo del iva*/
import controllers.actividad_3.finalscan
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
data class DatosIva(
    var dataInici: LocalDate,
    var dataFi: LocalDate,
    var ivaGeneral : Float,
    var ivaReduido : Float,
    var ivaSuperreduido : Float,
    var ivaExento :  Float
)

fun main(){
    val oriol :Array<DatosIva> = arrayOf(
        DatosIva(
            LocalDate.parse("01-01-1986", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
            LocalDate.parse("31-12-1991", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
            0.12f,
            0.06f,
            0f,
            0f),
        DatosIva(
            LocalDate.parse("01-01-1992", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
            LocalDate.parse("31-12-1992", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
            0.15f,
            0.06f,
            0f,
            0f),
        DatosIva(
            LocalDate.parse("01-01-1993", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
            LocalDate.parse("31-12-1994", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
            0.15f,
            0.06f,
            0.3f,
            0f),
        DatosIva(
            LocalDate.parse("01-01-1995", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
            LocalDate.parse("31-12-2009", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
            0.16f,
            0.07f,
            0.4f,
            0f),
        DatosIva(
            LocalDate.parse("01-01-2010", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
            LocalDate.parse("31-12-2011", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
            0.18f,
            0.08f,
            0f,
            0f),
        DatosIva(
            LocalDate.parse("01-01-2012", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
            LocalDate.parse("01-01-3000", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
            0.21f,
            0.10f,
            0.4f,
            0f),
    )

    val scan = inicioscan()
    val preu = pedirPrecio(scan)
    val tipus = pedirTipoIva(scan)
    val data = pedirFecha(scan)
    calcularIva(preu,tipus, data, oriol)
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

fun calcularIva (preu:Float, tipus:String, data: LocalDate, oriol:Array<DatosIva>) {

    var ivaAplicable = 0f
    for (i in oriol.indices) {
        if (data > oriol[i].dataInici && data < oriol[i].dataFi) {
            if (tipus == "general") {
                ivaAplicable = oriol[i].ivaGeneral
            } else if (tipus == "reduida") {
                ivaAplicable = oriol[i].ivaReduido
            } else if (tipus == "superreduida") {
                ivaAplicable = oriol[i].ivaSuperreduido
            } else if (tipus == "exento") {
                ivaAplicable = oriol[i].ivaExento
            } else {
                println("ERROR")
            }
        }
    }
    println(preu + (preu * ivaAplicable))
}
    fun finalscan(scan: Scanner) {
        scan.close()
}
//no se pueden hacer tests porque mi funcion del calculo del iva no devuelve nada y hay ciertos parametros del calculo que no se pueden modificar