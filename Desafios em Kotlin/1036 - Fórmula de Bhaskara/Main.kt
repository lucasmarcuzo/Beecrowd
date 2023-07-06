//Developed by: @LucasMarcuzo

import java.util.Scanner
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var a: Double
    var b: Double
    var c: Double
    var r1: Double
    var r2: Double
    
    a = scan.nextDouble()
    b = scan.nextDouble()
    c = scan.nextDouble()
    
    if (a == 0.0 || ((b * b) - (4 * a * c)) < 0) {
        println("Impossivel calcular")
    } else {
        r1 = (-b + sqrt((b * b) - (4 * a * c))) / (2 * a)
        r2 = (-b - sqrt((b * b) - (4 * a * c))) / (2 * a)
    
        println("R1 = %.5f".format(r1))
        println("R2 = %.5f".format(r2))
    }
    
    scan.close()


}
