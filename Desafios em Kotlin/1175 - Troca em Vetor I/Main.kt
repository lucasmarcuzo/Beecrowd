import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val vet = IntArray(20)

    for (i in vet.indices) {
        vet[i] = scan.nextInt()
    }

    val rev = IntArray(20)

    for (i in 0..19) {
        rev[i] = vet[19 - i]
    }

    for ((j, n) in rev.withIndex()) {
        println("N[$j] = $n")
    }

    scan.close()
}
