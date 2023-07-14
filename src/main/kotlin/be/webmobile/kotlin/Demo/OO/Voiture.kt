package be.webmobile.kotlin.demo.oo

// data: ctor primaire obligatoire
// data: val/var obligatoire pour les params du ctor primaire

// avantages:
// implementation auto de :
    // toString(), equals(), hashcode(), copy()
data class Voiture(val marque: String, val modele: String, val puissance: Int){
    fun maMethodeEnPlus(){
        println("une methode en plus")
    }
}