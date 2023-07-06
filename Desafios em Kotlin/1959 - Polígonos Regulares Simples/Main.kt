import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val N = scan.nextLong()
    val L = scan.nextLong()

    val total = N * L

    println(total)

    scan.close()
}
