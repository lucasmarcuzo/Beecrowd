// Developed by: @LucasMarcuzo

import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    var x: Int
    var y = 0
    var z = 0

    for (i in 1 until 101) {
        x = scan.nextInt()

        if (x > y) {
            y = x
            z = i
        }
    }

    println(y)
    println(z)

    scan.close()
}