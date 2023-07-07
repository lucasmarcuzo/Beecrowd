import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val TOPS = intArrayOf(1, 3, 5, 10, 25, 50, 100)

    val K = scan.nextInt()

    if (K == TOPS[0]) println("Top 1")
    else if (K <= TOPS[1]) println("Top 3")
    else if (K <= TOPS[2]) println("Top 5")
    else if (K <= TOPS[3]) println("Top 10")
    else if (K <= TOPS[4]) println("Top 25")
    else if (K <= TOPS[5]) println("Top 50")
    else println("Top 100")

    scan.close()
}
