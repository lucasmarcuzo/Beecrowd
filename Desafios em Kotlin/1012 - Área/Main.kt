import java.util.Scanner
import kotlin.math.pow

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    val values = DoubleArray(3)
    
    values[0] = scan.nextDouble()
    values[1] = scan.nextDouble()
    values[2] = scan.nextDouble()
    
    println("TRIANGULO: %.3f".format((values[0] * values[2]) / 2))
    println("CIRCULO: %.3f".format((3.14159 * (values[2] * values[2]))))
    println("TRAPEZIO: %.3f".format(((values[0] + values[1])) * values[2] / 2))
    println("QUADRADO: %.3f".format(values[1] * values[1]))
    println("RETANGULO: %.3f".format(values[0] * values[1]))
    
    scan.close()
}
