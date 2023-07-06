import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    var x: Int = scan.nextInt()

    if (x % 2 == 0) {
        x++
        for (i in 0 until 6) {
            println(x)
            x += 2
        }
    } else if (x % 2 != 0) {
        for (i in 0 until 6) {
            println(x)
            x += 2
        }
    }

    scan.close()
}
