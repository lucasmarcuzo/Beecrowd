//Developed by: @LucasMarcuzo

import java.util.*

fun main(args: Array<String>) {
    
    val n = readLine()!!.toInt()
    var x = 0
    var y = 1

    for (i in 1..(n -1)) 
    {
        print("$x ")
        
        val total = x + y
        x = y
        y = total
    }
    println("$x")
}