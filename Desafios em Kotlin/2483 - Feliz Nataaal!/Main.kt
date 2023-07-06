import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val x = scan.nextInt()
    var natal = "Feliz nat"

    for (i in 0 until x) {
        natal += "a"
    }

    natal += "l!"

    println(natal)

    scan.close()
}