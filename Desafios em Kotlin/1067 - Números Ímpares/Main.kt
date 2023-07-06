import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    val x: Int = scan.nextInt()

    for (i in 1..x) {
        if (i % 2 != 0) {
            println(i)
        }
    }

    scan.close()
}
