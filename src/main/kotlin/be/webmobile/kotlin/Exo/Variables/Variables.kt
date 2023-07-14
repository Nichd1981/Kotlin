package be.webmobile.kotlin.Exo.Variables

fun main() {
    println("Quel est votre nom ?")
    val nom = readln()

    println("Quel est votre age?")
    val age = readln().toInt()

    println("Bonjour $nom, vous avez $age ans")
}