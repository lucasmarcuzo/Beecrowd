//Developed by: @LucasMarcuzo

import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var s = 1.0

    for (i in 2..100) {
        s += 1.0 / i
    }

    println("%.2f".format(s))

    scan.close()
}