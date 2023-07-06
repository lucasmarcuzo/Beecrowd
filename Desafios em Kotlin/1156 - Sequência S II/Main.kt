import java.util.*
import java.io.IOException

fun main(args: Array<String>) {
    var num = 0.0
    var j = 1.0

    var i = 1
    while (i <= 39) {
        num += i / j
        i += 2
        j *= 2
    }

    println("%.2f".format(num))
}