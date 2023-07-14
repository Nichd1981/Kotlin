package be.webmobile.kotlin.Exo.Tableau

import kotlin.random.Random


fun main() {

    val tab = Array(10) { Random.nextInt(1, 101) }

    println( tab.joinToString(" > ") )
    for( i in 0 until tab.size-1 ){
        for( j in i until tab.size ){
            if( tab[j] < tab[i] ){
                val temp = tab[i]
                tab[i] = tab[j]
                tab[j] = temp
            }
        }
    }
//    tab.sort()
    println( tab.joinToString(" > ") )
}