import java.util.Scanner
import kotlin.math.pow

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    val r: Double
    val v = 4 / 3.0
    val i = 3.14159
    val total: Double
    
    val vol = v
    val pi = i
    r = scan.nextDouble()
    val radiusCube = r.pow(3)
    
    total = vol * pi * radiusCube
    
    println("VOLUME = %.3f".format(total))
    
    scan.close()

}
