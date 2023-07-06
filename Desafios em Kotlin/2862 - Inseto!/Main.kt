import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    val c = scan.nextInt()

    for (i in 0 until c) {
        val x = scan.nextInt()

        if (x > 8000) {
            println("Mais de 8000!")
        } else {
            println("Inseto!")
        }
    }

    scan.close()
}