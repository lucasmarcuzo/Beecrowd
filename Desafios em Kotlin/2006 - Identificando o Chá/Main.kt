import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    var x = 0
    var y = 0

    x = scan.nextInt()

    val vet = IntArray(5)

    vet[0] = scan.nextInt()
    vet[1] = scan.nextInt()
    vet[2] = scan.nextInt()
    vet[3] = scan.nextInt()
    vet[4] = scan.nextInt()

    for (i in vet.indices) {
        if (x == vet[i]) {
            y++
        }
    }

    println(y)

    scan.close()
}
