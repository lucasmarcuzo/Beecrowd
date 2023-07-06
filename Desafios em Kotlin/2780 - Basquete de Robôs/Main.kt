import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val jogada = scan.nextInt()

    when {
        jogada <= 800 -> println("1")
        jogada > 800 && jogada <= 1400 -> println("2")
        jogada > 1400 && jogada <= 2000 -> println("3")
    }

    scan.close()
}