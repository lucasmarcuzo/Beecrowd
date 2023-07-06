import java.io.IOException
import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val x = Array(12) { FloatArray(12) }
    var total = 0f

    val tipo = scan.next().single()

    for (i in 0 until 12) {
        for (j in 0 until 12) {
            x[i][j] = scan.nextFloat()
        }
    }

    var aux = 11
    for (j in 0 until 12) {
        for (i in 0 until aux) {
            total += x[j][i]
        }
        aux--
    }

    if (tipo == 'S') {
        println("%.1f".format(total))
    } else if (tipo == 'M') {
        println("%.1f".format(total / 66.0f))
    }

    scan.close()
}
