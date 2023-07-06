//Developed by: @LucasMarcuzo

import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var x: Int
    var y: Int

    do {
        x = scan.nextInt()
        y = scan.nextInt()

        if (x > y) {
            println("Decrescente")
        } else if (x < y) {
            println("Crescente")
        }
    } while (x != y)

    scan.close()
}