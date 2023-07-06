import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    var x = 1
    var n = scan.nextInt()

    while (x <= n) {
        if (n == 0) {
            break
        } else {
            if (x == n) {
                println(x)
                x = 0
                n = scan.nextInt()
            } else {
                print("$x ")
            }
        }
        x++
    }
    
    scan.close()
}