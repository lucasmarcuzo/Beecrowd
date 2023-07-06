//Developed by: @LucasMarcuzo

import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var x: Float
    var y: Float
    val z = 0.0f

    do {
        x = scan.nextFloat()
        y = scan.nextFloat()

        if (x > z && y > z) {
            println("primeiro")
        } else if (x < z && y > z) {
            println("segundo")
        } else if (x < z && y < z) {
            println("terceiro")
        } else if (x > z && y < z) {
            println("quarto")
        }

    } while (x != 0.0f && y != 0.0f)


    scan.close()
}