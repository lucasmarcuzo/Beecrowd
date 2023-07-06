import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val vet = DoubleArray(100)

    val x = scan.nextDouble()

    for (i in 0 until 100) {
        vet[i] = x / Math.pow(2.0, i.toDouble())
        println("N[$i] = %.4f".format(vet[i]))
    }

    scan.close()
}
