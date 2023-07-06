import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    val palavra = scan.next().toLowerCase()

    if (palavra.length <= 20) {
        if (palavra.length >= 10) {
            println("palavrao")
        } else {
            println("palavrinha")
        }
    }

    scan.close()
}