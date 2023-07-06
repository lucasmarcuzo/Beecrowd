import java.util.Scanner
import kotlin.math.floor
import kotlin.math.pow

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)
    
    val n: Int
    n = scan.nextInt()
    
    for (i in 0 until n) {
    
        val x = scan.nextDouble()
        println("${floor(2.0.pow(x) / 12000).toLong()} kg")
        
    }
    scan.close()
}