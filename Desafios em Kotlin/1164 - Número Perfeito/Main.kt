import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val x = scan.nextInt()

    for (i in 0 until x) {
        var valor = 0
        var total = 0

        valor = scan.nextInt()

        for (j in 1 until valor) {
            if (valor % j == 0) {
                total += j
            }
        }

        if (valor == total) {
            println("$valor eh perfeito")
        } else {
            println("$valor nao eh perfeito")
        }
    }

    scan.close()
}
