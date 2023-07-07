import java.util.Scanner

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`)

    val A = leitor.nextInt()
    val B = leitor.nextInt()
    val C = leitor.nextInt()

    val H = leitor.nextInt()
    val L = leitor.nextInt()

    if (A <= H && B <= L) {
        println("S")
    } else if (A <= H && C <= L) {
        println("S")
    } else if (B <= H && A <= L) {
        println("S")
    } else if (B <= H && C <= L) {
        println("S")
    } else if (C <= H && A <= L) {
        println("S")
    } else if (C <= H && B <= L) {
        println("S")
    } else {
        println("N")
    }

    leitor.close()
}
