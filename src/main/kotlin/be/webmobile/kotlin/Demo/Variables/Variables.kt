package be.webmobile.kotlin.Demo.Variables

fun main( args: Array<String> ) {

    // var ou val
    // Pour les variables
    var variable = "ma variable"
    // Pour les constantes
    val CONSTANTE = "ma constante"

    variable = "pas de soucis"
//    CONSTANTE = "probleme"

    // Les primitifs n'existent plus
    var entier1 : Int
    var entier2 = 5
    var entier3 : Int = 7

    var tresPetitEntier: Byte
    var petitEntier: Short
    var grandEntier /*: Long */ = 15L

    var reel/*: Float*/ = 5.0F
    var reelPrecis: Double

    var caractere: Char = '\uF603' // betterie qui charge
    var boolean: Boolean

    // Null-Safety
//    boolean = null; // Impossible, les types n'acceptent pas la valeur null par défaut

    // pour accepter une valeur null:
    var booleanNullable : Boolean?
    booleanNullable = null;

    // Conversion
    reelPrecis = entier3.toDouble()

}