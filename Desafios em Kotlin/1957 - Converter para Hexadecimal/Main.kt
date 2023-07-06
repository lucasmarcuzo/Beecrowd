import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val x = scan.nextInt()

    val y = Integer.toHexString(x)

    println(y.toUpperCase())

    scan.close()
}
