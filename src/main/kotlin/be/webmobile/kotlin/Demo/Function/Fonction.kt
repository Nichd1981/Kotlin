package be.webmobile.kotlin.Demo.Function


fun main() {

    afficherNombre()
    salutuation( salue = "dominique", saleur = "marie" ); // Utilisation de paramètres nommé
// Permet d'appeler la méthode d'en respecter l'ordre des params

    // Les fonctions lambdas

    var a: (a: Int, b: Int) -> Unit; // Typage de fonctions pour les variables contenant des lambdas
    a = { a,b -> println(a*b) }      // Les lambdas s'écrivent entre {...}. Pas des (...) pour entourer les params.
    // S'il y a plusieurs instructions :
    a = { a, b -> run {
        val rslt = a * b
        println(rslt)
    }
    }

    // Execution de la lambda:
    a(5,6)


    val tab = arrayOf("ok", "ko", "kokok")
    // Si mon dernier param est une lambda, je peux la sortir des paramètres :
    applyOnEach(tab, { element -> println(element) })
    applyOnEach(tab) { element -> println(element) } // Pareil à la ligne précédente
    applyOnEach(tab) { println(it) } // Pareil à la ligne précédente (on peut utiliser it si la lambda n'a qu'un seul param)
    applyOnEach(tab) { element -> println(element.uppercase()) }
    applyOnEach(tab) { element -> println(element.length) }
    // si pas d'autre param, je peux ne pas mettre de parenthèse
    run/*()*/ {  -> println("ma lambda") }
    // run est une fonction


}

// Function - a un retour
fun addition(a: Int, b: Int): Int {
    return a + b
}

// Procedure - n'a pas de retour - Type de retour Unit (pas de retour - equivalent VOID) - la declaration du type de retour n'est pas nécessaire
fun afficherNombre(nombre: Int = 0): Unit { // Nombre est un paramètre optionnel
    println(nombre)
}

// Si une procédure n'a qu'une seule instruction, on peut directement écrire la fonction de la manière suivante :
fun salutuation(saleur: String, salut: String = "bonjour", salue: String = "Luc") {
    println("$salut $salue, je suis $saleur")
}
fun salutuationBis(saleur: String, salut: String = "bonjour", salue: String = "Luc") =
    println("$salut $salue, je suis $saleur")


// Fonction single-value : lorsqu'on n'a pas besoin de multiple instruction pour calculer le retour,
// on peut directement marque "= <le retour en question>"
fun add(a: Int, b: Int): Int = a + b

// Applique "action" sur chaque élément du tableau
// Quand je déclare avec un type de fonction retournant Unit, je dois le mettre
fun applyOnEach(tab: Array<String>, action: (element: String) -> Unit ){
    for (element in tab) {
        action(element)
    }
}