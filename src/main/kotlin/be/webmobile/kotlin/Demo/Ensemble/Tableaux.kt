package be.webmobile.kotlin.demo.ensemble

fun main() {
    val tab2: Array<String> = arrayOf( "salut", "ca va?", "au revoir" );
    // Le constructeur de array prend une taille et une lambda d'init.
    // La lambda init permet de donner une valeur
    // Si une lambda doit être passé en dernier param, elle est être sortie des parenthèse
//    EXEMPLE : val tab: Array<String> = Array(3, { index -> "salut" })
//    Devient:

    val tab: Array<String> = Array(3) { "salut" } // { index -> "salut" }
    // {"salut", "salut", "salut"}
    val tab3 = Array(3) { it+1 } // { index -> index+1 } // it renvoie à la valeur du param de la lambda
    // { 1, 2, 3 }

    tab[0] = "ok"
//    tab.set(0, "ok") // pareil
    tab[1] = "ko"
//    tab.set(1, "ko") // pareil

    for (element in tab){
        println(element)
    }

    for ((index, value) in tab.withIndex()) {
        println( "$index - $value" )
    }
//    for (index in 0 until tab.size){
//        println( "$index - ${tab[index]}" )
//    }
    for (index in tab.indices) {
        println("$index - ${tab[index]}")
//        println( "$index - ${tab.get(index)}" ) // pareil
    }
}