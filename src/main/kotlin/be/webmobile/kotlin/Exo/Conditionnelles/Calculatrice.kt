package be.webmobile.kotlin.exo.conditionnelles

fun main() {

    println("""
        Quelle opération?
        + ) addition
        - ) soustraction
        * ) multiplication
        / ) division
        DIV ) division entière
        % ) modulo
    """.trimIndent())
    val operation = readln()

    print("Valeur 1: ")
    val v1 = readln().toInt()
    print("Valeur 2: ")
    val v2 = readln().toInt()

    when (operation) {
        "+" -> println("$v1 $operation $v2 = ${v1+v2}")
        "-" -> println("$v1 $operation $v2 = ${v1-v2}")
        "*" -> println("$v1 $operation $v2 = ${v1*v2}")
        "/" -> {
            if( v2 == 0 )
                println("division par 0 impossible")
            else
                println("$v1 $operation $v2 = ${v1 / v2.toDouble()}")
        }
        "DIV" -> {
            if( v2 == 0 )
                println("division par 0 impossible")
            else
                println("$v1 $operation $v2 = ${v1 / v2}")
        }
        "%" -> {
            if( v2 == 0 )
                println("modulo par 0 impossible")
            else
                println("$v1 $operation $v2 = ${v1 % v2}")
        }
        else -> println("opérateur invalide")
    }

    // Version 2
//    if( v2 == 0 && (operation == "/" ||operation == "DIV" || operation == "%" ) ) {
//        println("division par 0 impossible")
//    }
//    else{
//        val rslt = when (operation) {
//            "+" -> v1 + v2
//            "-" -> v1 - v2
//            "*" -> v1 * v2
//            "/" -> v1 / v2
//            "DIV" -> v1 / v2
//            "%" -> v1 % v2
//            else -> null
//        }
//
//        if( rslt == null ){
//            println("opérateur invalide")
//        }
//        else {
//            println("$v1 $operation $v2 = $rslt")
//        }
//    }



}