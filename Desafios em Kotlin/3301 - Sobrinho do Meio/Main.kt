//Developed by: @LucasMarcuzo

import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var H: Int
    var Z: Int
    var L: Int

    H = scan.nextInt()
    Z = scan.nextInt()
    L = scan.nextInt()

    if ((H > Z && H < L) || (H < Z && H > L)) {
        println("huguinho")
    } else if ((H < Z && Z < L) || (H > Z && L < Z)) {
        println("zezinho")
    } else if ((H > Z && L > Z) || (H < Z && H < L)) {
        println("luisinho")
    }

    scan.close()
}