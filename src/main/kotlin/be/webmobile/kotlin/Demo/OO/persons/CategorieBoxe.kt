package be.webmobile.kotlin.demo.oo.persons

enum class CategorieBoxe(val poidMin: Int, val poidMax: Int) {

    PLUME(Int.MIN_VALUE, 50),
    LEGER(51, 60),
    MOYEN(61, 80),
    LOURD(81, Int.MAX_VALUE);

    fun categorieSuperieur(): CategorieBoxe{
        return when(this) {
            PLUME -> LEGER
            LEGER -> MOYEN
            MOYEN -> LOURD
            else -> LOURD
        }
    }

}