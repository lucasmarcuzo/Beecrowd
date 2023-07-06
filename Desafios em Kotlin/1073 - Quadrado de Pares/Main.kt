import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    var x: Int
    val y = 2

    x = scan.nextInt()

    for (i in 1..x) {
        if (i % 2 == 0) {
            println("$i^$y = ${i * i}")
        }
    }

    scan.close()
}
