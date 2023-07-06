//Developed by: @LucasMarcuzo

import java.util.Scanner
import kotlin.math.roundToInt

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    var MaiorAB: Int
    var MaiorABC: Int
    
    val a = scan.nextInt()
    val b = scan.nextInt()
    val c = scan.nextInt()
    
    MaiorAB = (a + b + Math.abs(a - b)) / 2
    MaiorABC = (MaiorAB + c + Math.abs(MaiorAB - c)) / 2
    println("$MaiorABC eh o maior")
    
    scan.close()

}
