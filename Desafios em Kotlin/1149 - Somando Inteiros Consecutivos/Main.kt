//Developed by: @LucasMarcuzo

import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var a: Int
    var n = 0
    var i = 1
    var x = 0

    a = scan.nextInt()
    n = scan.nextInt()

    while (n <= 0) {
        i++
        n = scan.nextInt()
    }

    for (j in 0 until n) {
        x += a + j
    }

    println(x)

    scan.close()
}