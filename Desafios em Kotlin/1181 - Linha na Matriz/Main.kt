import java.io.IOException
import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val m = Array(12) { FloatArray(12) }
    var soma = 0f
    var media = 0f
    var elemento: Float
    var linha: Int
    var operacao: Char

    linha = scan.nextInt()
    operacao = scan.next().single()

    for (i in 0 until 12) {
        for (j in 0 until 12) {
            elemento = scan.nextFloat()
            m[i][j] = elemento
        }
    }

    if (operacao == 'S') {
        var i = linha
        while (i == linha) {
            for (j in 0 until 12) {
                soma += m[i][j]
            }
            i++
        }
        println("%.1f".format(soma))
    } else if (operacao == 'M') {
        var i = linha
        while (i == linha) {
            for (j in 0 until 12) {
                media += m[i][j]
            }
            i++
        }
        println("%.1f".format(media / 12))
    }

    scan.close()
}
