import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var m: Int
    var n: Int
    var t: Int

    m = scan.nextInt()
    n = scan.nextInt()

    while (m > 0 && n > 0) {
        t = 0

        if (m <= 0 || n <= 0) {

        } else if (m > n) {
            for (i in n..m) {
                t += i
                print("$i ")
            }

            println("Sum=$t")

        } else if (n > m) {
            for (i in m..n) {
                t += i
                print("$i ")
            }

            println("Sum=$t")
        }

        m = scan.nextInt()
        n = scan.nextInt()
    }

    scan.close()
}
