import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var m: Double
    var n: Double
    var calc = 1

    do {
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

        println("media = %.2f".format((m + n) / 2))

        do {
            println("novo calculo (1-sim 2-nao)")
            calc = scan.nextInt()

        } while (calc != 1 && calc != 2)

    } while (calc == 1)

    scan.close()
}
