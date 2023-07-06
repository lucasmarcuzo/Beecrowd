import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    val n = scan.nextInt()

    for (i in 0 until n) {
        var x = scan.nextInt()
        val y = scan.nextInt()

        var z = 0
        var j = 0

        while (j != y) {
            if (x % 2 != 0) {
                z += x
                j++
            }
            x++
        }

        println(z)
    }

    scan.close()
}