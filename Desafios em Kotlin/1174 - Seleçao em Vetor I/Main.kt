import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var i = 0
    val vet = DoubleArray(100)

    do {
        vet[i] = scan.nextDouble()
        i++
    } while (i < 100)

    for (j in vet.indices) {
        if (vet[j] <= 10) {
            println("A[$j] = %.1f".format(vet[j]))
        }
    }

    scan.close()
}
