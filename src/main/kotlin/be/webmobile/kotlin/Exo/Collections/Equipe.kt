package be.webmobile.kotlin.Exo.Collections

fun main() {

    val joueursSansEquipe: MutableList<String> = mutableListOf()
    val equipes: MutableMap<String, MutableList<String>> = mutableMapOf()

    var input: Int;

    do {
        println("""
            MENU
            -------------------------------------
            1 - ajouter un joueur
            2 - ajouter une équipe
            3 - ajouter un joueur dans une équipe
            4 - afficher membre d'une équipe
            -------------------------------------
            5 - quitter
            -------------------------------------
        """.trimIndent())

        input = readln().toInt()

        when(input) {
            1 -> {
                println("Quel nom de joueur a ajouter?")
                joueursSansEquipe.add( readln() )
            }
            2 -> {
                println("Quel nom pour l'équipe a ajouter?")
                val nom = readln()
                if( nom !in equipes.keys )
                    equipes[nom] = mutableListOf()
//                    equipes.put( nom, mutableListOf() ) // pareil
                else
                    println("Cette équipe existe déjà")
            }
            3 -> {
                println("Nom de l'équipe dans laquel il faut ajouter un joueur?")
                val nomEquipe = readln()
                if( nomEquipe in equipes.keys ){
                    println("Nom du joueur a ajouter dans l'équipe?")
                    val nomJoueur = readln()
                    if( nomJoueur in joueursSansEquipe ) {
                        joueursSansEquipe.remove(nomJoueur)
                        equipes[nomEquipe]!!.add(nomJoueur)
                        println("Le joueur $nomJoueur a été ajouté à $nomEquipe")
                    } else {
                        println("Le joueur n'existe pas ou a déjà intégré une équipe")
                    }
                }
                else {
                    println("L'équipe n'existe pas")
                }
            }
            4 -> {
                println("Quelle équipe?")
                val nomEquipe = readln()
                if( nomEquipe in equipes.keys ){
                    println("-- Equipe $nomEquipe --")

                    // Facon 1
//                    val equipe = equipes[nomEquipe]
//                    if( equipe != null ){
//                        for (s in equipe) {
//                            println("- $s")
//                        }
//                    }
                    // facon 2
//                    for (membre in equipes[nomEquipe]!!){ // raccourci de la méthode .get(key)
                    // facon 3
//                    for (membre in equipes.get(nomEquipe)!!){
                    // facon 4
                    for (membre in equipes.getValue(nomEquipe)){
                        println("- $membre")
                    }
                }
                else {
                    println("L'équipe n'existe pas")
                }
            }
            5 -> println("Au revoir")
            else -> println("Cette commande est invalide")
        }

    } while ( input != 5 );

}