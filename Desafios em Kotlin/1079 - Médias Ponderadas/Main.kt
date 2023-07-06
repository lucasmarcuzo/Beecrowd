//Developed by: @LucasMarcuzo

import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)
    var n: Int
    var x: Float
    var y: Float
    var z: Float

    n = scan.nextInt()

    val vet = FloatArray(n)

    for (i in 0 until n) {
        x = scan.nextFloat()
        y = scan.nextFloat()
        z = scan.nextFloat()

        vet[i] = (x * 2 + y * 3 + z * 5) / 10
    }

    for (j in vet) {
        System.out.printf("%.1f\n", j)
    }

    scan.close()
}
