import java.io.IOException
import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextInt()

    val result = ((Math.pow(((1 + Math.sqrt(5.0)) / 2), n.toDouble()) - Math.pow(((1 - Math.sqrt(5.0)) / 2), n.toDouble())) / Math.sqrt(5.0))

    println("%.1f".format(result))
}