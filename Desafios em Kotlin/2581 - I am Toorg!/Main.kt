// Developed by: @LucasMarcuzo

import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val x = scan.nextInt()

    for (i in 1..x) {
        val s = scan.next()
        println("I am Toorg!")
    }

    scan.close()
}