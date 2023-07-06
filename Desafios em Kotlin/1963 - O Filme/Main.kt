import java.util.Scanner

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`)

    val A = leitor.nextDouble()
    val B = leitor.nextDouble()

    val valorIngresso = (((B - A) / A) * 100)

    System.out.printf("%.2f%%\n", valorIngresso)
}
