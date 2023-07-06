import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val x = Array(12) { FloatArray(12) }
    var tipo: Char

    tipo = scan.next().single()

    for (i in 0 until 12) {
        for (j in 0 until 12) {
            x[i][j] = scan.nextFloat()
        }
    }

    var total = 0f

    for (i in 5..6) {
        total += x[i][7]
    }

    for (j in 4..7) {
        total += x[j][8]
    }

    for (k in 3..8) {
        total += x[k][9]
    }

    for (l in 2..9) {
        total += x[l][10]
    }

    for (m in 1..10) {
        total += x[m][11]
    }

    if (tipo == 'S') {
        println("%.1f".format(total))
    } else if (tipo == 'M') {
        println("%.1f".format(total / 30.0f))
    }

    scan.close()
}
