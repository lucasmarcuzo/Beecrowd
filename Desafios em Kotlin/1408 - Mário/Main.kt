import java.util.*

fun main(args: Array<String>) {

    val Num_armarios = IntArray(100000)
    val scan = Scanner(System.`in`)

    while (true) {
        var n = scan.nextInt()
        var l = scan.nextInt()
        if (n == 0) {
            break
        }
        for (i in 0 until l) {
            Num_armarios[i] = scan.nextInt()
        }

        println(n - melhorSeq(n, l, Num_armarios))
    }
}

fun melhorSeq(n: Int, l: Int, Num_armarios: IntArray): Int {
    var MaiorSeqPossivel = 0
    var indFinal = l - 1

    while (indFinal > 0 && Num_armarios[indFinal] > Num_armarios[l - 1] - n) {
        indFinal--
    }

    if (indFinal < l - 1 && Num_armarios[indFinal] < Num_armarios[l - 1] - n) {
        indFinal++
    }

    for (i in 0..indFinal) {
        val x = verifica(i, n, l, Num_armarios)
        if (x > MaiorSeqPossivel) {
            MaiorSeqPossivel = x
        }
    }

    return MaiorSeqPossivel
}

fun verifica(inicio: Int, n: Int, l: Int, Num_armarios: IntArray): Int {
    var i = inicio
    val posFinal = Num_armarios[inicio] + n

    while (true) {
        if (i < l && Num_armarios[i] < posFinal) {
            i++
        } else {
            break
        }
    }

    return i - inicio
}
