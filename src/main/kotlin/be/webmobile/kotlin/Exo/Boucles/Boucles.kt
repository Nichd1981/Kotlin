package be.webmobile.kotlin.exo.boucle

fun main() {

    var number: Int
    var sum = 0

    for (i in 1..10){
        do {
            number = readln().toInt()
            if( number < -100 || number > 100 )
                println("invalide")
        } while( number < -100 || number > 100 ) // (number in -100..100)

        sum += number
    }

    println("moyenne: ${sum / 10.0}")

}