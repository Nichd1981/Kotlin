package be.webmobile.kotlin.Demo.Utiles

import kotlin.random.Random

fun main() {

    for (i in 1..25) {
        println( Random.nextInt(1, 101) )
    }

}