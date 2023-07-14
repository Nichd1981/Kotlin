package be.webmobile.kotlin.demo.oo

// sealed => abstract
// sealed: La classe n'est heritable que dans le même package
sealed class Rectangle(val longueur: Double, val largeur: Double) {

    // accès uniquement dans le module (dans le projet)
    internal abstract fun calculateArea(): Double

}