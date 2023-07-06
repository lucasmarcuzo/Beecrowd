import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val x = Array(12) { DoubleArray(12) }
    var tipo: Char

    tipo = scan.next().single()

    for (i in 0 until 12) {
        for (j in 0 until 12) {
            x[i][j] = scan.nextDouble()
        }
    }

    var total = 0.0

    for (i in 5..6) {
        total += x[4][i]
    }

    for (j in 4..7) {
        total += x[3][j]
    }

    for (k in 3..8) {
        total += x[2][k]
    }

    for (l in 2..9) {
        total += x[1][l]
    }

    for (m in 1..10) {
        total += x[0][m]
    }

    if (tipo == 'S') {
        println("%.1f".format(total))
    } else if (tipo == 'M') {
        total /= 30.0
        println("%.1f".format(total))
    }

    scan.close()
}
