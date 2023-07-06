import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    var x: Int
    var y: Int
    var z: Int
    val w = 60
    val v = 24

    x = scan.nextInt()
    y = scan.nextInt()

    if (x < y) {
        z = ((y * w - x * w) / w)
        println("O JOGO DUROU $z HORA(S)")
    } else if (x > y) {
        z = (v - x) + y
        println("O JOGO DUROU $z HORA(S)")
    } else {
        z = 24
        println("O JOGO DUROU $z HORA(S)")
    }

    scan.close()
}
