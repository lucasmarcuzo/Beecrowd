import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val vetor = IntArray(101)

    for (i in 1 until vetor.size) {
        vetor[i] = i
    }

    for (j in 1 until vetor.size) {
        val x = vetor[j] % 2

        if (x == 0) {
            println(vetor[j])
        }
    }

    scan.close()
}
