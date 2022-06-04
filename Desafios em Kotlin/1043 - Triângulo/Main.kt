//Developed by: @LucasMarcuzo

import java.util.*

fun main(args: Array<String>) {

    val input = readLine()!!
    val a = input.split(" ")[0].toFloat()
    val b = input.split(" ")[1].toFloat()
    val c = input.split(" ")[2].toFloat()
    
    val perimetro = (a + b + c)
    val area = ((a+b)*c)/2
    
    if (a < (b + c) && b < (a + c) && c < (a + b))
    {
        println(String.format("Perimetro = %.1f", perimetro))
    }
    else
    {
        println(String.format("Area = %.1f", area))
    } 
}
