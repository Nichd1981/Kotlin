package be.webmobile.kotlin.demo.oo

import be.webmobile.kotlin.demo.oo.persons.Employe
import be.webmobile.kotlin.demo.oo.persons.ISalueur
import be.webmobile.kotlin.demo.oo.persons.Person0


// Alias de type
typealias MultiValueMap = Map<String, List<Int>>

fun main() {

    val pers = Person0("dubois", "luc", 54)
//    pers.age = -5 // je ne peux plus: private
//    println( pers.age )

    // Plus possible: Person1 est abstract
//    val pers1 = Person1("marie", "dubosquet", 7)
//    println( pers1.age )
//    pers1.sePresenter()


    val empl = Employe( "dominique", "dubuisson", 64, 5000 )
    empl.sePresenter()

    // classe sealed
    val carre = Carre(5.0)
    carre.calculateArea() // accessible dans tout le module
    println( "toString de Carre: $carre" )

    // data class
    val voiture = Voiture("vrimvroum", "bipboup", 1)
    println( "toString de Voiture: $voiture" )

    val tristan = Employe("tristan", "", 0,0)
    empl salue tristan
//    empl.salue(tristan) // pareil que ^

    println( "le nom de 'empl'(${empl.prenom}) est en maj: ${empl.nameIsCapitalized()}" );

    val gagnant = empl bagarre tristan
    println("BAGARRE -> gagnant: ${gagnant.prenom}")


    // companion object:
    println( "companion object: ${Employe.POPULATION}" )

    // utilisation du typealias
    val map: MultiValueMap;
}

// ceci est une méthode d'extension
// on rajoute la méthode à la classe
fun Employe.nameIsCapitalized(): Boolean{
    return this.nom.isCapitalized()
}
// Attention : accessible uniquement dans le même package
fun String.isCapitalized(): Boolean{
    return this.first() in 'A'..'Z'
}
// Ca fonctionne aussi pour les methodes 'infix'
infix fun Employe.bagarre(emp: Employe): Employe {
    return if( this.salaire > emp.salaire ) this else emp;
}
