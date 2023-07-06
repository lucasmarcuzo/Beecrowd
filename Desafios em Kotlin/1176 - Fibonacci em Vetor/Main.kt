import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var n1: Long = 0
    var n2: Long = 1
    var n3: Long = 0

    val x = scan.nextInt()

    val vet = LongArray(61)

    val vety = IntArray(x)

    for (i in 0 until x) {
        vety[i] = scan.nextInt()
    }

    for (j in 1 until 61) {
        n1 = n2
        n2 = n3
        n3 = n1 + n2
        vet[j] = n3
    }

    for (m in 0 until x) {
        for (k in 0 until 61) {
            if (vety[m] == k) {
                val strLong = vet[k].toString()
                println("Fib(${vety[m]}) = $strLong")
            }
        }
    }

    scan.close()
}
