import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)
    var n: Int
    
    n = scan.nextInt()
    
    for (i in 0 until 10000) {
        if (i % n == 2) {
            println(i)
        }
    }
    
    scan.close()
}
