package be.webmobile.kotlin.Demo.Progression
fun main() {

    // Ensemble des valeurs successive avec un step de 1
    val range: IntRange = IntRange(1, 5);
    // Ensemble de valeurs successive avec un step non prédéfini
    val progression: IntProgression = range step 2;
    // IntRange est un enfant de IntProgression


    // Autres moyens de créer des IntRange:
    var autreRange: IntRange
    autreRange = IntRange(1,5)
    autreRange = 1..5
    autreRange = 1.rangeTo(5)
    autreRange = 1 until 6
    // Dans l'autre sens (forcement une IntProgression: step n'est pas 1 mais est négatif)
    val autreProgression: IntProgression = 5 downTo 1

    println(autreProgression.step)
    for (i in autreProgression) {
        println(i)
    }

    // Attention aux Range/Prgression vide
    var progVide: IntProgression = IntRange.EMPTY
    progVide = 5..-5 // Range vide
    progVide = 5 until 5 // Range vide
    progVide = 6 downTo 10 // Progression vide

    for (i in progVide) {
        println(i) // on ne passe jamais par ici
    }

    // utiliser "step" pour récupérer une Progression avec un step différent
    var progStepModif = autreRange step 5 // garde les mêmes bornes mais avec un step différent
    progStepModif = 5 downTo 1 step 2; // step demande un nombre positif. Il reste dans la même orientation que la progression precedente

    println( progStepModif.step )
    for (i in progStepModif) {
        println(i)
    }
}