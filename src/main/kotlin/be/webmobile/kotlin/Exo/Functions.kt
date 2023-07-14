package be.webmobile.kotlin.Exo

import java.util.*
import kotlin.random.Random

fun main() {

    val tableauEntier = Array(10){ Random.nextInt(1,101) }
    println("Avant: ${tableauEntier.joinToString(" - ") { "$it" }}")
    val tableauCopieTrie = creationCopieTableau(tableauEntier)
    println("Après: ${tableauCopieTrie.joinToString(", ")}")
    println("Origin: ${tableauEntier.joinToString()}")

    val tableauString = arrayOf("luc", "dominique", "Marie")
    println(tableauString.joinToString())
    val majElement = filtreTableau(tableauString) { element -> element.first() in 'A' .. 'Z' }
    println("Maj: ${majElement.joinToString()}")
    val tailleElement = filtreTableau(tableauString){ it.length >= 5 }
    println("Taille: ${tailleElement.joinToString()}")
}
fun creationCopieTableau(origin: Array<Int>): Array<Int>{
    val copie = origin.copyOf()
    copie.sort()
    return copie
}

fun filtreTableau(origin: Array<String>, predicate: (element: String) -> Boolean ): List<String> {
//    val filtreElementTableau: MutableList<String> = mutableListOf()
//    for (element in origin){
//        if (predicate(element))
//            filtreElementTableau.add(element)
//    }
//    return filtreElementTableau
    return Arrays.stream( origin)
        .filter(predicate)
        .toList()
}

