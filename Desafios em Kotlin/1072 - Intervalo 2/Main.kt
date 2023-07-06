import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    var n: Int
    var x = 0
    var y = 0

    n = scan.nextInt()

    val vet = IntArray(n)

    for (i in 0 until vet.size) {
        vet[i] = scan.nextInt()

        if (vet[i] >= 10 && vet[i] <= 20) {
            x++
        } else {
            y++
        }
    }

    println("$x in")
    println("$y out")

    scan.close()
}
