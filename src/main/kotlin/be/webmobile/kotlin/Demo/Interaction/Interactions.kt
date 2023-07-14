package be.webmobile.kotlin.Demo.Interaction

import java.util.Scanner

fun main() {

    println("""
        Ecrire en console
        fnoefn
    """.trimIndent()) // Vire les indentation(/tab) du code dans la chaine de charactère

    val input = readln().toInt()

    println("mon input: $input") // pour integrer un variable on peut utiliser $variable
    println("mon input plus 5: ${input + 5}") // pour integrer la valeur d'une expression ${expression}

    val sc = Scanner(System.`in`)
    // Je peux accéder aux mêmes méthodes qu'en Java.
    // Attention aux retours

}