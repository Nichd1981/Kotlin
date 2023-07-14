package be.webmobile.kotlin.Exo.Collections

fun main() {

    val cours = listOf( "java", "javascript", "kotlin" )
    val etudiants = listOf( "luc", "marie", "dominique" )

    val notes: Map<String, MutableMap<String, Int>> = mapOf(
        cours[0] to mutableMapOf(),
        cours[1] to mutableMapOf(),
        cours[2] to mutableMapOf()
    )
    // Version sans input user
    // pour java
//    notes[cours[0]]?.put(etudiants[0], 0)
//    notes[cours[0]]?.put(etudiants[1], 0)
//    notes[cours[0]]?.put(etudiants[2], 0)
    // pour javascript
//    notes[cours[1]]?.put(etudiants[0], 0)
//    notes[cours[1]]?.put(etudiants[1], 0)
//    notes[cours[1]]?.put(etudiants[2], 0)
    // pour kotlin
//    notes[cours[2]]?.put(etudiants[0], 0)
//    notes[cours[2]]?.put(etudiants[1], 0)
//    notes[cours[2]]?.put(etudiants[2], 0)

    var input: Int;
    do {
        println("""
            ACTIONS:
            1) donner les notes des etudiants pour 1 cours
            2) afficher les notes d'un étudiants pour ses cours
            3) quitter
        """.trimIndent())
        input = readln().toInt();
        when( input ){
            1 ->  {
                // donner les notes des etudiants pour 1 cours
                println("Quel cours (${ cours.joinToString(", ") }) ?")
                val cours = readln()
                val notePourCours = notes[cours]
                if( notePourCours == null ) {
                    println("Ce cours n'existe pas")
                } else {
                    for (etudiant in etudiants) {
                        print("pour $etudiant : ")
                        val note = readln().toInt()
                        notePourCours.put(etudiant, note)
                    }
                }
            }
            2 -> {
                println("Quel étudiant? (${ etudiants.joinToString(", ") })")
                val etudiant = readln()
                for( coursIndividuel in cours ){
                    val notesPourCours: MutableMap<String, Int>? = notes[coursIndividuel]
                    println("note de $etudiant pour $coursIndividuel: ${notesPourCours?.get(etudiant)}")
                }
            }
            3 -> println("au revoir")
            else -> println("mauvais input")
        }

    } while( input != 3 );




}