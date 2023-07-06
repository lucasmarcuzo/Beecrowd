import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    var n = 0
    var a = 0
    var b = 0
    var c = 0

    do {
        n = scan.nextInt()

        if (n >= 1 && n <= 3) {
            when (n) {
                1 -> a++
                2 -> b++
                3 -> c++
            }
        }
    } while (n != 4)

    println("MUITO OBRIGADO")
    println("Alcool: $a")
    println("Gasolina: $b")
    println("Diesel: $c")

    scan.close()
}