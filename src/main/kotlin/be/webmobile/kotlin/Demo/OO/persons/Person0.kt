package be.webmobile.kotlin.demo.oo.persons

class Person0  {

    var nom: String // on doit soit initialiser directement soit l'inclure dans ts les ctor
//    lateinit var nom: String // ou alors utiliser le mot clef 'lateinit' "t'inquiete je la donnerai plus tard"
    var prenom: String
    public var age: Int // public par défaut
        public get // prend le même accès que la propriété => public
        private set(value) {
            if( value >= 0 ) {
                field = value // field represente la variable sous la propriété
            }
        }

    constructor(nom: String, prenom: String, age: Int) {
        this.nom = nom
        this.prenom = prenom
        this.age = age
    }
}