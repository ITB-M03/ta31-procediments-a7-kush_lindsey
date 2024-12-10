package controllers.actividad_3


import java.util.*

fun main(){
    val scan = inicioscan()
    val contrasenya = pedirContrasenya(scan)
        validarSuperUsuari(contrasenya)
    mostrarResultado(validarSuperUsuari(contrasenya),contrasenya)
    finalscan(scan)
}
fun inicioscan(): Scanner {
    return Scanner(System.`in`).useLocale(Locale.UK)
}
fun pedirContrasenya(scan: Scanner):String{
    val scan = Scanner(System.`in`)
    println("Ingresa tu contraseña:")
    var pedirContrasenya = scan.nextLine()
    var contrasenyaRealNoFake : String = "holaSantiYDani"
    return pedirContrasenya
}

fun validarSuperUsuari(pedirContrasenya:String):Boolean{
    var ciertoOErroneo = false
    if (pedirContrasenya=="holaSantiYDani"){
        ciertoOErroneo = true
    }
    return ciertoOErroneo
}
fun mostrarResultado (validarSuperUsuari:Boolean, contrasenya:String):String{
        if (validarSuperUsuari(contrasenya) == false){
            println("Error")
        }
        if (validarSuperUsuari(contrasenya)==true){
            println("Encertado")
            System.exit(0)
        }
    return contrasenya
}

fun finalscan(scan: Scanner) {
    scan.close()
}
