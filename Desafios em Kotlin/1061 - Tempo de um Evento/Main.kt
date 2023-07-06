import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var d1: Int
    var h1: Int
    var m1: Int
    var s1: Int
    var d2: Int
    var h2: Int
    var m2: Int
    var s2: Int

    var x: Char

    var dia: String

    dia = scan.next()
    d1 = scan.nextInt()

    h1 = scan.nextInt()
    x = scan.next()[0]
    m1 = scan.nextInt()
    x = scan.next()[0]
    s1 = scan.nextInt()

    dia = scan.next()
    d2 = scan.nextInt()

    h2 = scan.nextInt()
    x = scan.next()[0]
    m2 = scan.nextInt()
    x = scan.next()[0]
    s2 = scan.nextInt()

    s1 = s2 - s1
    m1 = m2 - m1
    h1 = h2 - h1
    d1 = d2 - d1

    if (s1 < 0) {
        s1 += 60
        m1--
    }

    if (m1 < 0) {
        m1 += 60
        h1--
    }

    if (h1 < 0) {
        h1 += 24
        d1--
    }

    println("$d1 dia(s)")
    println("$h1 hora(s)")
    println("$m1 minuto(s)")
    println("$s1 segundo(s)")

    scan.close()
}
