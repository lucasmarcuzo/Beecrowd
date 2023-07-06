//Developed by: @LucasMarcuzo

import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var h1: Int
    var m1: Int
    var s1: Int
    var h2: Int
    var m2: Int
    var s2: Int
    var tempo: Int
    var hr: Int
    var min: Int

    h1 = scan.nextInt()
    m1 = scan.nextInt()
    h2 = scan.nextInt()
    m2 = scan.nextInt()

    if (h2 <= h1 && m2 <= m1) {
        h2 += 24
    } else if (m2 <= m1) {
        m2 += 60
        h2 -= 1
    }

    s1 = (h1 * 3600) + (m1 * 60)
    s2 = (h2 * 3600) + (m2 * 60)

    tempo = s2 - s1
    hr = tempo / 3600
    min = (tempo - (hr * 3600)) / 60

    println("O JOGO DUROU $hr HORA(S) E $min MINUTO(S)")

    scan.close()
}
