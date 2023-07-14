package be.webmobile.kotlin.demo.Conditionnelles

fun main() {

    println("Quel est votre age?")
    val age = readln().toInt()

//    if( age >= 18 ) {
//        println("Vous être majeur")
//    }
//    else if (age >= 0){
//        println("Vous êtes mineur")
//    }
//    else {
//        println("Vous êtes inexistant")
//    }

    val majorite: String =
        if( age >= 18 ) {
            "majeur"
        } else if( age >= 0 ) {
            "mineur"
        } else {
            "inexistant"
        }
//    majorite =  age >= 18 ? "majeur" : "mineur"; // n'existe pas en kotlin

    println("Vous êtes $majorite")

    // switch -> when
    when(age) {
//        age -> println("tout le temps vrai") // à ne pas faire
        in 0..17 -> println("mineur")
        // Je peux utiliser des valeurs resultantes de fonctions, d'opération, de variables etc ...
        "18".toInt() -> {
            println("Vous devenez majeur")
        }
        65 -> println("Vous devenez retraité")
        !in 0 .. Int.MAX_VALUE -> println("Vous êtes inexistant")
        else -> println("Age banal")
    }

    // La structure peut aussi renvoyer une valeur
    val majorite2 = when(age) {
        in 0..17 -> "mineur"
        in 18 .. Int.MAX_VALUE -> "majeur"
        else -> "inexistant"
    }
    println("2 - Vous êtes $majorite2")

    // Si je n'utilise pas les paramètres, chaque cas est verifié par une expression booleénne
    val majorite3 = when {
        age in 0 .. 17 -> "mineur"
        age in 18 .. Int.MAX_VALUE -> "majeur"
        false -> "jamais executé" // La condition peut ne pas être basé sur age
        else -> "inexistant"
    }
    println("3 - Vous êtes $majorite3")

}