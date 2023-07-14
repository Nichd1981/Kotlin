package be.webmobile.kotlin.demo.oo.exception

fun main() {
    try {
        throwException();
    }
    catch (e: DemoException) {
        println("une DemoException s'est produite (msg: ${e.message})")
    }
    catch (e: Exception) {
        println("Une autre exception s'est produite")
    }
}

// interet: methode qui echoue à chaque fois (lancement d'exception particulière)
fun throwException(): Nothing {
//    return // pas de return possible
    throw DemoException();
}