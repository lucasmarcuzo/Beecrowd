import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    var a: Int
    var b: Int
    var y = 0

    a = scan.nextInt()
    b = scan.nextInt()

    if (a == b) {
        y = 0
    } else if (a < b) {
        for (i in a + 1 until b) {
            if (i % 2 == 1 || i % 2 == -1) {
                y += i
            }
        }
    } else if (a > b) {
        for (i in b + 1 until a) {
            if (i % 2 == 1 || i % 2 == -1) {
                y += i
            }
        }
    }

    println(y)

    scan.close()
}
