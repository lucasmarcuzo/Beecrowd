import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var x: Int
    var y: Int
    var z: Int
    var z1: Int
    var z2: Int

    z = scan.nextInt()

    for (i in 0 until z) {

        x = scan.nextInt()
        y = scan.nextInt()
        z1 = 0
        z2 = 0

        if (x > y) {

            for (j in y + 1 until x) {

                if (j % 2 != 0) {
                    z1 += j
                }
            }

            println(z1)

        } else {

            for (k in x + 1 until y) {

                if (k % 2 != 0) {
                    z2 += k
                }
            }

            println(z2)
        }

    }

    scan.close()
}
