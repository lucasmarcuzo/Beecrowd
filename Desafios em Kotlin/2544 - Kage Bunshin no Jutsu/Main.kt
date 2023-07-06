import java.io.IOException
import java.util.Scanner

fun main(args: Array<String>) {
    
    val scan = Scanner(System.`in`)
    
    while (scan.hasNext()) {
        val N = scan.nextInt()
        println(log2(N).toInt())
    }
}
    
fun log2(N: Int): Int {
    return (Math.log(N.toDouble()) / Math.log(2.0)).toInt()
}
