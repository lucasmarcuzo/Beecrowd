import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)

    val horasaida = sc.nextInt()
    val tempoviagem = sc.nextInt()
    val fuso = sc.nextInt()

    var total = horasaida + tempoviagem + fuso

    if (total >= 24) {
        total -= 24
    } else if (total < 0) {
        total += 24
    }

    println(total)

    sc.close()
}