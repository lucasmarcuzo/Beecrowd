import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val x = scan.nextInt()

    val l = arrayOfNulls<String>(x)

    for (i in 0 until x) {
        l[i] = scan.next()
    }

    println("Ciencia da Computacao")

    scan.close()
}
