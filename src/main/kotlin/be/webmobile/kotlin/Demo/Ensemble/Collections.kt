package be.webmobile.kotlin.Demo.Ensemble

fun main() {
    // Je peux interagir avec une liste de la même manière qu'avec un tableau
    val list: List<String> = listOf("ok", "ko")
    // Sauf pour changer les éléments de la liste : impossible la liste est immutable
//    list[0] = "ko";
    for (index in list.indices){
        println("${list[index]}")
    }

    val mutableList: MutableList<String> = mutableListOf();
//    val muttableList: MutableList<String> = MutableList(1) {"ok"};
    mutableList.add("ok")
    mutableList.add("ko")
    mutableList.remove("ko")

//    muttableList.removeAt(0)
//    muttableList.add(0,"kokok")

    mutableList[0] = "kokok"
//    muttableList.set(0, "kokok") // pareil

    for (index in mutableList.indices){
        println("${mutableList[index]}")
    }

    val set = setOf( "ok", "ok", "ko" ) // pas de double, pas d'ordre => pas d'index (utilisable uniquement comme ensemble
    println(set.joinToString(", "))
//    println( set[0] ) // impossible

    val mutableSet = mutableSetOf("ok", "ko")
    mutableSet.add("kokok")
    mutableSet.remove("kokok")
//    mutableSet.removeAt(0) // n'existe pas sur les set

    val map = mapOf(
        "luc" to 15, // to opérateur créant une Paire : key to value
        "marie" to 12,
        "dominique" to 7
    )

    println( map["luc"] ) // récupère la valeur liée à la clef "luc" => 15
    for (key in map.keys) {
        println("$key - ${map[key]}")
    }

    for (pair in map.entries) {
        println( "${ pair.key } - ${ pair.value }" )
    }

    val mutableMap = mutableMapOf(
        "luc" to 15,
        "marie" to 12,
        "dominique" to 7
    )

    mutableMap.put("michel", 20) // si la clef n'existe pas, ajoute
    mutableMap.put("michel", 15) // si la clef existe, modifie

}