//Developed by: @LucasMarcuzo

import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    while (true) {
        var num = 0
        var i = 0
        var v = 0

        num = scan.nextInt()

        if (num == 0) {
            break
        } else {
            do {
                if (num % 2 == 0) {
                    i += num
                    v++
                }
                num++

            } while (v < 5)

            println(i)
        }
    }

    scan.close()
}
