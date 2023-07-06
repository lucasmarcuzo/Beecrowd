import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    var i = 1
    var m: Int
    var n: Int
    var o = 1

    m = scan.nextInt()
    n = scan.nextInt()

    do {
        if (o != m) {
            o++
            print("$i ")
        } else {
            println(i)
            o = 1
        }

        i++
    } while (i <= n)

    scan.close()
}