//Developed by: @LucasMarcuzo

import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var n: Int
    var x: Int
    var y: Int
    var i: Int
    var resultado = 0f

    n = scan.nextInt()

    for (i in 0 until n) {
        x = scan.nextInt()
        y = scan.nextInt()

        if (y == 0) {
            println("divisao impossivel")
        } else {
            resultado = x.toFloat() / y.toFloat()
            println("%.1f".format(resultado))
        }
    }

    scan.close()
}