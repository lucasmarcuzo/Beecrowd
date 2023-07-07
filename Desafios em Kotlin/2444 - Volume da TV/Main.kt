import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val volumeInicial = scan.nextInt()
    val numModificacoes = scan.nextInt()
    var totalVolume = volumeInicial

    for (i in 0 until numModificacoes) {
        totalVolume += scan.nextInt()
        if (totalVolume < 0) totalVolume = 0
        else if (totalVolume > 100) totalVolume = 100
    }

    println(totalVolume)

    scan.close()
}
