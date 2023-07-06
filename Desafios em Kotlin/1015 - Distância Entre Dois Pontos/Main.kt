//Developed by: @LucasMarcuzo

import java.util.Scanner
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    var distancia: Double
    var x: Double
    var y: Double
    
    val x1 = scan.nextDouble()
    val y1 = scan.nextDouble()
    val x2 = scan.nextDouble()
    val y2 = scan.nextDouble()
    
    distancia = sqrt((x2 - x1).pow(2) + (y2 - y1).pow(2))
    
    println("%.4f".format(distancia))
    
    scan.close()


}
