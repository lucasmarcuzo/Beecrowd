//Developed by: @LucasMarcuzo

import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var n: Int

    n = scan.nextInt()

    for (i in 1..n) {
        if (n % i == 0) {
            println(i)
        }
    }

    scan.close()
}