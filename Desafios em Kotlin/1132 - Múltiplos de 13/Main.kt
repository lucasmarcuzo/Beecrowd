//Developed by: @LucasMarcuzo

import java.util.*

fun main(args: Array<String>) {
    val x = (readLine() ?: return).toInt()
    val y = (readLine() ?: return).toInt()
    var total = 0

    if (x < y) 
    {
        for (i in x..y) 
        {
            if (i % 13 != 0) 
            {
                total += i
            }
        }
    } 
    else 
    {
        for (i in y..x) 
        {
            if (i % 13 != 0) 
            {
                total += i
            }
        }
    }
    println(total)
}