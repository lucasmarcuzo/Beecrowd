import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val x = scan.nextInt()
    val y = scan.nextInt()

    val xadrez = Array(x) { IntArray(y) }

    for (i in 0 until x) {
        for (j in 0 until y) {
            val o = i + j
            if (o % 2 == 0) {
                xadrez[i][j] = 1
            } else {
                xadrez[i][j] = 0
            }
        }
    }

    println("${xadrez[x - 1][y - 1]}")

    scan.close()
}