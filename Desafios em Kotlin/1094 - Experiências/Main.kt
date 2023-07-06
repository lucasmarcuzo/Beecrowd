// Developed by: @LucasMarcuzo

import java.util.Scanner

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    var n: Int
    var C = 0
    var R = 0
    var S = 0
    var x: Int
    var coelhos = 0
    var ratos = 0
    var sapos = 0
    var total: Int
    var tc: Float
    var tr: Float
    var ts: Float
    var y: Char

    n = scan.nextInt()

    for (i in 0 until n) {
        x = scan.nextInt()
        y = scan.next().toCharArray()[0]

        if (y == 'C') {
            C++
            coelhos += x
        } else if (y == 'R') {
            R++
            ratos += x
        } else if (y == 'S') {
            S++
            sapos += x
        }
    }

    total = coelhos + ratos + sapos

    println("Total: $total cobaias")
    println("Total de coelhos: $coelhos")
    println("Total de ratos: $ratos")
    println("Total de sapos: $sapos")

    tc = coelhos.toFloat() / total * 100
    tr = ratos.toFloat() / total * 100
    ts = sapos.toFloat() / total * 100

    println("Percentual de coelhos: %.2f %%".format(tc))
    println("Percentual de ratos: %.2f %%".format(tr))
    println("Percentual de sapos: %.2f %%".format(ts))

    scan.close()
}