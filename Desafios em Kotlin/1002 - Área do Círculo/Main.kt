import java.util.Scanner
import kotlin.math.pow

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    val n = 3.14159
    val raio = scan.nextDouble()
    val area = n * (Math.pow(raio, 2.0))

    println("A=%.4f".format(area))
}