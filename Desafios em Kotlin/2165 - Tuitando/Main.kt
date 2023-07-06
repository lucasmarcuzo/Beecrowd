// Developed by: @LucasMarcuzo

import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val y = s.length

    if (y <= 140) {
        println("TWEET")
    } else {
        println("MUTE")
    }

    scan.close()
}