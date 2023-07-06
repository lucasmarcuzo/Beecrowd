import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    var a: Int
    var b: Int
    var c: Int

    a = scan.nextInt()
    b = scan.nextInt()
    c = scan.nextInt()

    if (a < b && a < c) {
        println(a)

        if (b < c) {
            println(b)
            println(c)
            println("")
            println(a)
            println(b)
            println(c)
        } else if (c < b) {
            println(c)
            println(b)
            println("")
            println(a)
            println(b)
            println(c)
        }
    } else if (b < a && b < c) {
        println(b)

        if (a < c) {
            println(a)
            println(c)
            println("")
            println(a)
            println(b)
            println(c)
        } else if (c < a) {
            println(c)
            println(a)
            println("")
            println(a)
            println(b)
            println(c)
        }
    } else if (c < a && c < b) {
        println(c)

        if (b < a) {
            println(b)
            println(a)
            println("")
            println(a)
            println(b)
            println(c)
        } else if (a < b) {
            println(a)
            println(b)
            println("")
            println(a)
            println(b)
            println(c)
        }
    }
    scan.close()
}
