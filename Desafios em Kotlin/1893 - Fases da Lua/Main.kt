import java.util.Scanner

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`)

    val inicio = leitor.nextInt()
    val fim = leitor.nextInt()

    if (inicio >= 0 && fim <= 2) {
        println("nova")
    } else if (inicio >= 3 && fim <= 96 && inicio > fim) {
        println("minguante")
    } else if (fim >= 97 && inicio <= 100) {
        println("cheia")
    } else if (fim >= 3 && inicio <= 96) {
        println("crescente")
    }

    leitor.close()
}
