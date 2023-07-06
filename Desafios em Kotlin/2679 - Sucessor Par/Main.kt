import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var x = scan.nextInt()

    while (true) {
        if (x % 2 != 0) {
            x++
            println(x)
            break
        } else {
            x += 2
            println(x)
            break
        }
    }

    scan.close()
}
