import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    var x: Int
    var y: Int

    x = scan.nextInt()
    y = scan.nextInt()

    if (y % x == 0 || x % y == 0) {
        println("Sao Multiplos")
    } else {
        println("Nao sao Multiplos")
    }
    scan.close()
}
