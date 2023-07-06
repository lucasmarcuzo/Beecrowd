import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var m: Int
    var z = 1000

    m = scan.nextInt()

    val vet = IntArray(m)

    for (i in 0 until m) {
        vet[i] = i
    }

    for (v in 0 until z) {
        val j = v % m
        println("N[$v] = ${vet[j]}")
    }

    scan.close()
}
