package be.webmobile.kotlin.Demo.Operateur

fun main() {

    // opérateur arithmtique
    var rslt: Double
    val a = 5
    val b = 7

    rslt = (a + b).toDouble()
    rslt = (a - b).toDouble()
    rslt = (a * b).toDouble()
    rslt = (a / b).toDouble()   // division entière
    rslt = a.toDouble() / b     // division réelle
    rslt = (a % b).toDouble()

    // opérateur comparaison:
    println( a == b )   // vérifie l'egalité via .equals(...)
    println( a === b )  // vérifie si la référence est la même
    println( a != b )
    println( a !== b )

    println( a < b )    // utilise la methode compareTo(...)
    println( a <= b )
    println( a > b )
    println( a >= b )

    // opérateur logique

    // ET - &&
    println(true  && true)  // true
    println(true  && false) // false
    println(false && true)  // false
    println(false && false) // false

    // OU - ||
    println(true  || true)  // true
    println(true  || false) // true
    println(false || true)  // true
    println(false || false) // false

    // NON - !
    println(!true)  // false
    println(!false) // true

    // D'autres opérateurs intéressants
    // Opérateurs de range: voir progresssion/Progression.kt

    // Opérateurs d'appartenance (.contains(...))
    println(5 in (1 until 10)) // vérifie si le Range contient 5
    println(5 !in (1 until 10)) // vérifie si le Range ne contient pas 5

    // instanceof de java devient is en kotlin
    val prog : IntProgression = 1..5 step 2

    println( prog is IntProgression )   // true
    println( prog is LongProgression )  // false

    // opérateur de Null-Safety
    val varNull: String? = null
    val varNonNull: String? = "pas null"

    // Je ne peux pas faire un appel direct au variable/methode sur une valeur nullable
//    println( varNull.length )

    // Je peux faire appel grâce à une de ces 2 options:

    // !!. - génère une erreur si la variable est null (Not-Null assertion)
//    println( varNull!!.length )   // => NullPointerException
    println( varNonNull!!.length )  // => La taille de la chaine

    // ?.  - ne fait l'action que si la valeur n'est pas null, sinon renvoie null (Null-Safe)
    println( varNull?.length )      // => null
    println( varNonNull?.length )   // => La taille de la chaine

}