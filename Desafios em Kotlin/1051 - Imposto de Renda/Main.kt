import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var x = 0.0

    x = scan.nextDouble()

    when {
        x <= 2000.00 -> {
            println("Isento")
        }
        x <= 3000.00 -> {
            x -= 2000.00
            x *= 0.08
            println("R$ %.2f".format(x))
        }
        x <= 4500.00 -> {
            x -= 3000.00
            x *= 0.18
            x += (1000 * 0.08)
            println("R$ %.2f".format(x))
        }
        else -> {
            x -= 4500.00
            x *= 0.28
            x += (1500 * 0.18) + (1000 * 0.08)
            println("R$ %.2f".format(x))
        }
    }

    scan.close()
}
