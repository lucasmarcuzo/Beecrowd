import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    var w = 0
    var x = 0
    var y = 0
    var z = 0

    val vetor = IntArray(5)

    for (i in vetor.indices) {
        vetor[i] = scan.nextInt()
    }

    for (i in vetor.indices) {
        if (vetor[i] > 0) {
            w++
        }
        if (vetor[i] < 0) {
            x++
        }
        if (vetor[i] % 2 == 0) {
            y++
        }
        if (vetor[i] % 2 != 0) {
            z++
        }
    }

    println("$y valor(es) par(es)")
    println("$z valor(es) impar(es)")
    println("$w valor(es) positivo(s)")
    println("$x valor(es) negativo(s)")

    scan.close()
}
