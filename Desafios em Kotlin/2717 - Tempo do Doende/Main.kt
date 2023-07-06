import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val finalExpediente = scan.nextInt()

    val presente1 = scan.nextInt()
    val presente2 = scan.nextInt()

    val total = presente1 + presente2

    if (total > finalExpediente) {
        println("Deixa para amanha!")
    } else {
        println("Farei hoje!")
    }

    scan.close()
}