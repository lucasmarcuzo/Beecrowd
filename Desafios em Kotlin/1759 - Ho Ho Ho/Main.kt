import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val N = scan.nextInt()

    for (i in 0 until N) {
        if (i < N - 1) {
            print("Ho ")
        } else {
            println("Ho!")
        }
    }
}
