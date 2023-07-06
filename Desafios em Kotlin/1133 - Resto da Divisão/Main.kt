//Developed by: @LucasMarcuzo

import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var x: Int
    var y: Int

    x = scan.nextInt()
    y = scan.nextInt()

    if (x > y) {

        for (j in y + 1 until x) {

            if (j % 5 == 2 || j % 5 == 3) {
                println(j)
            }
        }

    } else {

        for (k in x + 1 until y) {

            if (k % 5 == 2 || k % 5 == 3) {
                println(k)
            }
        }
    }

    scan.close()
}