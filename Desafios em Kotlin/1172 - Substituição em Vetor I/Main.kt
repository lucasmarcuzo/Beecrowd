import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val vet = IntArray(10)

    for (i in vet.indices) {
        vet[i] = scan.nextInt()

        if (vet[i] <= 0) {
            vet[i] = 1
        }
    }

    for (i in vet.indices) {
        println("X[$i] = ${vet[i]}")
    }

    scan.close()
}
