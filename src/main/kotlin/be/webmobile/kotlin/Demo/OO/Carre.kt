package be.webmobile.kotlin.demo.oo

import be.webmobile.kotlin.demo.oo.Rectangle

class Carre: Rectangle {

    // Si il n'y a pas de ctor primaire, ce sont les ctor secondaire qui decident chacun
    constructor(longueur: Double) : super(longueur, longueur)

    override fun calculateArea(): Double {
        return longueur*longueur
    }
}