import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val N = scan.nextLong()

    val total = (N * N - 3 * N) / 2

    println(total)

    scan.close()
}
