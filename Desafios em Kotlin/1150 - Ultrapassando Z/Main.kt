//Developed by: @LucasMarcuzo

import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var x: Int
    var z: Int
    var y: Int
    var i = 0

    x = scan.nextInt()

    do {
        z = scan.nextInt()
    } while (z <= x)

    y = x
    x = 0

    while (x <= z) {
        x += y++
        i++
    }

    println(i)

    scan.close()
}