//Developed by: @LucasMarcuzo

import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextInt()

    for (i in 1..n) {
        val pow2 = i * i
        val pow3 = i * i * i

        println("$i $pow2 $pow3")
        println("$i ${pow2 + 1} ${pow3 + 1}")
    }

    scan.close()
}