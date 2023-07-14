package be.webmobile.kotlin.demo.oo.persons

// open: héritable
// var/val devant les params du ctor pour en faire des props
abstract class Person1(var prenom: String, val nom: String, age: Int){

    var age: Int = 0
        set(v: Int){
            if( v >= 0 )
                field = v
        }

    init { // le corps du constructeur primaire
        this.age = age
    }

    init{ // Les différents blocks init sont exécutés les un après les autres à l'exécution du ctor primaire
        println("init: ${this.age}")
    }

    constructor(prenom: String, nom: String): this(prenom, nom, 0) // ne peut pas exister sans faire ref au ctor primaire (this(...))
    /*{}*/ // accolades optionnelles si pas d'instructions

    open fun sePresenter() {
        println("Bonjour, je m'appelle $prenom $nom")
    }

    // infix: défini un opérateur
    // 1e terme: this, 2e terme le param
    // infix: la méthode doit avoir 1 et 1seul param
    infix fun salue(aSalue: Person1){
        println("Salut, ${aSalue.prenom}, je suis ${this.prenom}")
    }

}