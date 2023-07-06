import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)

    val vl = sc.next()

    val nomes = arrayOfNulls<String>(10)

    for (i in 0 until 10) {
        nomes[i] = sc.nextLine()
    }

    for (i in 1..10) {
        if (i == 2 || i == 6 || i == 8) {
            println(nomes[i])
        }
    }
}