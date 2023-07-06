import java.util.*

fun main(args: Array<String>) {
    
    val sc = Scanner(System.`in`)

    while (true) {
        val linha = sc.nextLine().split(" ")

        val x1 = linha[0].toInt()
        val y1 = linha[1].toInt()
        val x2 = linha[2].toInt()
        val y2 = linha[3].toInt()

        if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) {
            break
        }

        if (x1 == x2 && y1 == y2) {
            println("0")
        } else if ((x2 - x1) == -(y2 - y1) || -(x2 - x1) == -(y2 - y1) || -(x2 - x1) == (y2 - y1) || (x2 - x1) == (y2 - y1)) {
            println("1")
        } else if (x1 == x2 || y1 == y2) {
            println("1")
        } else {
            println("2")
        }
    }
}
