import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val x = scan.nextInt()

    for (i in 0 until x) {
        val n = scan.nextLong()

        val n1 = java.lang.Long.toUnsignedString(n)

        val z = java.lang.Long.valueOf(n1)

        println(String.format("%.0f", z - (Math.floor(Math.sqrt(z.toDouble())))))
    }
}
