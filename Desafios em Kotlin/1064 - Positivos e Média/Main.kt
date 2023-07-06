import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var x = 0.0
    var y = 0.0
    var cont = 0
    var z = 0.0
    val vetor = DoubleArray(6)

    for (i in 0 until vetor.size) {
        vetor[i] = scan.nextDouble()

        if (vetor[i] > z) {
            x += vetor[i]
            cont++
            y = x / cont
        }
    }

    println("${cont} valores positivos")
    println("%.1f".format(y))

    scan.close()
}
