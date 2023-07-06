import java.util.*

fun main(args: Array<String>) {
    
    val scan = Scanner(System.`in`)
    var i: Int
    
    i = scan.nextInt()
    
    val dividends = intArrayOf(i)
    val divisors = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    
    for (divisor in divisors) {
        for (dividend in dividends) {
            val longResult: Long = dividend.toLong() * divisor.toLong()
            println("$divisor x $dividend = $longResult")
        }
    }
    
    scan.close()
}