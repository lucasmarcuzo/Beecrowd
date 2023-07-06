import java.io.IOException
import java.util.*

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`)

    val N = leitor.nextInt()
    var T: Int
    var menor = 21
    var posMenor = 0

    for (i in 1..N) {
        T = leitor.nextInt()
        if (menor > T) {
            menor = T
            posMenor = i
        }
    }

    println(posMenor)
}
