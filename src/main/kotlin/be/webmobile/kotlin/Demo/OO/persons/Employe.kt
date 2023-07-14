package be.webmobile.kotlin.demo.oo.persons


// On ne peut heriter que des classes 'open'
class Employe(prenom: String, nom: String, age: Int, val salaire: Int): Person1(prenom, nom, age), IPaie {

    // on redéfini la propriété (attention ce sont en realité des methodes get/set) => override
    override var solde/*: Int */= 0
    // override: Les methodes redefinies doivent etre caractérisées par le mot clef 'override'

    override fun sePresenter() {
//        super.sePresenter() // je peux utiliser super pour accéder au methodes comme définies dans le parent
        println("Bonjour, je suis $prenom $nom, l'employé (age: $age, salaire: $salaire)")
    }

    // Si défini dans un des parents, redéfini dans l'enfant => override
    override fun seFairePayer() {
        solde += salaire;
    }

    // Les objets compagnons permettent de remplacer les var/methodes static en kotlin
    // Les var/methodes qui auraient été mise en static en java se mettent
    // dans l'objet compagnon
    // Elle s'accède pareil en kotlin
    companion object {
        val POPULATION= 2_000_000_000
    }
}