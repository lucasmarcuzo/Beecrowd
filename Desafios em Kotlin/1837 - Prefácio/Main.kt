import java.util.Scanner
import kotlin.math.abs

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val a = scan.nextInt()
    val b = scan.nextInt()

    var r = a % b

    if (r < 0) {
        r += abs(b)
    }

    val q = (a - r) / b

    println("$q $r")

    scan.close()
}
