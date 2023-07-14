

import org.w3c.dom.ranges.Range

fun main() {

    // WHILE
    var nbrOeuf = 5
    while( nbrOeuf > 0 ){
        println("Je casse un oeuf")
        nbrOeuf--
    }

    // DO ... WHILE
    var input: Int
    do {
        input = readln().toInt();
    } while ( input > 10 || input < 0 )

    // for(int i = 0 ;...;...){...} java absent en kotlin
    // le foreach prend sa place
    // Sur quoi je peux faire un foreach? sur les Iterable<?>
    for ( element in 1..5 ){
        println("$element - je casse un oeuf")
    }

    for ( element in arrayOf(12,0,15) ){
        println(element)
    }

    for ( index in arrayOf(12,0,15).indices ){
        println(index)
    }

    for ( (index, value) in arrayOf("ok","bonjour", "au revoir").withIndex() ){
        println( "$index - $value" )
    }

}