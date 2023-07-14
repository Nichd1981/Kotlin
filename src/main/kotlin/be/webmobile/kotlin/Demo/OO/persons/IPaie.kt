package be.webmobile.kotlin.demo.oo.persons

interface IPaie {

    var solde: Int

    // A partir du moment ou la methode a un comportement, elle n'est plus abstract:
    // plus de nécessité de redéfinir.
    fun seFairePayer(){
        solde += 1000
    }
}