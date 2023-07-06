import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var n: Int
    var x = 0
    var y = 0

    n = scan.nextInt()

    for (i in 1..n) {
        x = scan.nextInt()
        y = 0

        for (j in 1 until x) {
            if (x % j == 0) {
                y += j
            }
        }

        if (y == 1) {
            println("$x eh primo")
        } else {
            println("$x nao eh primo")
        }
    }

    scan.close()
}
