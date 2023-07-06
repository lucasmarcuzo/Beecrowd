import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var x: String
    var y: Int
    val n = scan.nextInt()

    for (i in 0 until n) {
        x = scan.next()
        y = scan.nextInt()

        if (x == "Thor") {
            println("Y")
        } else {
            println("N")
        }
    }

    scan.close()
}
