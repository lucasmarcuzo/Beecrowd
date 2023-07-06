import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)
    var N: Int
    var X: Int
    var a: Int
    
    N = scan.nextInt()
    
    for (a in 1..N) {
        X = scan.nextInt()
        
        when {
            X == 0 -> println("NULL")
            X <= 0 && X % 2 == 0 -> println("EVEN NEGATIVE")
            X <= 0 && X % 2 == -1 -> println("ODD NEGATIVE")
            X >= 0 && X % 2 == 0 -> println("EVEN POSITIVE")
            X >= 0 && X % 2 == 1 -> println("ODD POSITIVE")
        }
    }
    
    scan.close()
}
