import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var n: Int
    var y = 1000
    var z = 0

    n = scan.nextInt()

    val vet = IntArray(n)

    for (i in 0 until vet.size) {
        vet[i] = scan.nextInt()

        if (vet[i] < y) {
            y = vet[i]
            z = i
        }
    }

    println("Menor valor: $y")
    println("Posicao: $z")

    scan.close()
}
