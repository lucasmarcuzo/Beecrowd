import java.util.HashMap
import java.util.Map
import java.util.Scanner

fun main(args: Array<String>) {
    val scr = Scanner(System.`in`)
    val valores = scr.nextInt()
    val numeros: MutableMap<Int, Int> = HashMap()

    for (i in 0 until valores) {
        val numero = scr.nextInt()

        if (numeros.containsKey(numero)) {
            numeros.replace(numero, numeros[numero]!! + 1)
        } else {
            numeros[numero] = 1
        }
    }

    numeros.entries
        .sortedBy { it.key }
        .forEach { e -> println("${e.key} aparece ${e.value} vez(es)") }
}
