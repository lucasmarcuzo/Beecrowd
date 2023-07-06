import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var x = 0
    val vetor = DoubleArray(6)

    for (i in 0 until vetor.size) {
        vetor[i] = scan.nextDouble()
    }

    for (i in 0 until vetor.size) {
        if (vetor[i] > 0) {
            x++
        }
    }

    println("$x valores positivos")

    scan.close()
}
