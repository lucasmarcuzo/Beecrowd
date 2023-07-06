//Developed by: @LucasMarcuzo

import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var m: Double
    var n: Double
    var t: Double

    do {
        m = scan.nextDouble()

        if (m < 0.0 || m > 10.0) {
            println("nota invalida")
        }

    } while (m < 0.0 || m > 10.0)

    do {
        n = scan.nextDouble()

        if (n < 0.0 || n > 10.0) {
            println("nota invalida")
        }

    } while (n < 0.0 || n > 10.0)


    t = (m + n) / 2

    println("media = %.2f".format(t))

    scan.close()
}