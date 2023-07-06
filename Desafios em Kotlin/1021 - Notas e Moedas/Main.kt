//Developed by: @LucasMarcuzo

import java.util.Scanner
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    
    val scan = Scanner(System.`in`)

    var dinheiro = scan.nextDouble()
    val valor = doubleArrayOf(100.0, 50.0, 20.0, 10.0, 5.0, 2.0, 1.0, 0.50, 0.25, 0.10, 0.05, 0.01)
    var quantidadeNotas = dinheiro.toInt()
    var quantidadeMoedas = ((dinheiro - quantidadeNotas) * 100).toInt()

    println("NOTAS:")
    for (i in 0 until 6) {
        quantidadeNotas = (dinheiro / valor[i]).toInt()
        println("${quantidadeNotas} nota(s) de R$ %.2f".format(valor[i]))
        dinheiro -= quantidadeNotas * valor[i]
    }

    println("MOEDAS:")
    for (i in 6 until 12) {
        quantidadeMoedas = (dinheiro / valor[i]).toInt()
        println("${quantidadeMoedas} moeda(s) de R$ %.2f".format(valor[i]))
        dinheiro -= quantidadeMoedas * valor[i]
        dinheiro = (dinheiro * 100.0).roundToInt() / 100.0
    }

    scan.close()
}
