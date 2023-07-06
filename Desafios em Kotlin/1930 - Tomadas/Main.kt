import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var y = 0

    val x = IntArray(4)

    x[0] = scan.nextInt()
    x[1] = scan.nextInt()
    x[2] = scan.nextInt()
    x[3] = scan.nextInt()

    for (i in 0 until 3) {
        y += x[i] - 1
    }

    println("${y + x[3]}")

    scan.close()
}
