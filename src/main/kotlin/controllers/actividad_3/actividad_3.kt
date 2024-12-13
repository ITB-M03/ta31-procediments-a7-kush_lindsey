package controllers.actividad_3


import java.util.*
const val password = "holaSantiYDani"

fun main(){
    val scan = inicioscan()
    validar(scan)
    finalscan(scan)
}
fun inicioscan(): Scanner {
    return Scanner(System.`in`).useLocale(Locale.UK)
}
fun pedirContrasenya(scan: Scanner):String{
    val scan = Scanner(System.`in`)
    println("Ingresa tu contraseña:")
    var pedirContrasenya = scan.nextLine()
    return pedirContrasenya
}

fun validarSuperUsuari(pedirContrasenya:String):Boolean{
    var ciertoOErroneo = false
    if (pedirContrasenya== password){
        ciertoOErroneo = true
    }
    return ciertoOErroneo
}
fun mostrarResultado (resultado:Boolean){

        if (resultado == false){
            println("Error")
        }
        if (resultado==true){
            println("Acertado")
        }
}
fun validar (scan: Scanner){
    var errores = 0
    do {
       val contrasenya= pedirContrasenya(scan)
        val resultado = validarSuperUsuari(contrasenya)
        mostrarResultado(resultado)
        if (resultado==false){
            errores++
        }
    }while (!resultado && errores < 3)
}

fun finalscan(scan: Scanner) {
    scan.close()
}
