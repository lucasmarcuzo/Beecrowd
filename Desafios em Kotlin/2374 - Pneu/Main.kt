import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val A = scan.nextInt()
    val B = scan.nextInt()

    val total = A - B

    println(total)

    scan.close()
}
