//Developed by: @LucasMarcuzo

import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var n: Int

    n = scan.nextInt()

    for (i in 1..n) {
        println("$i ${i * i} ${i * i * i}")
    }

    scan.close()
}