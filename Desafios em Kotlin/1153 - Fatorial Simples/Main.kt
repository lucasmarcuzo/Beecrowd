import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    var n: Int
    var f: Int
    var x: Int
    x = 1;
    f = 1;

    n = scan.nextInt()

    while (x <= n) {
        f *= x
        x++
    }

    println(f)

    scan.close()
}