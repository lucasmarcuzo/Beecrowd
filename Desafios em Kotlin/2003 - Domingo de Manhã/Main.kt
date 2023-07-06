import java.io.IOException
import java.util.Scanner

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`)

    while (leitor.hasNext()) {
        val relogio = leitor.nextLine().split(":")

        val hora = relogio[0].toInt()
        val min = relogio[1].toInt()

        when (hora) {
            7 -> println("Atraso maximo: $min")
            8 -> println("Atraso maximo: ${60 + min}")
            9 -> println("Atraso maximo: ${120 + min}")
            else -> println("Atraso maximo: 0")
        }
    }
}
