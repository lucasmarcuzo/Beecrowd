import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    var x: Int
    var y = 0
    var cont = 0

    do {
        x = scan.nextInt()

        if (x > 0) {
            y += x
            cont++
        }

    } while (x > 0)

    val z: Float = y.toFloat() / cont

    println("%.2f".format(z))

    scan.close()
}