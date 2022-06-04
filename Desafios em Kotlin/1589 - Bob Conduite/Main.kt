//Developed by: @LucasMarcuzo

import java.util.*

fun main(args: Array<String>) {
    val nTestes = readLine()!!.toInt()
    var i = 0

    while (i < nTestes){
        var cont = 0
        while (cont == 0) {
            var raios = readLine()
            var raiosArray: List<String> = raios!!.split(" ")
            var r1 = raiosArray[0]
            var r2 = raiosArray[1] 
            var total = Integer.parseInt(r1) + Integer.parseInt(r2)
            println("${total}")
            cont++
        }
        i++
    }
}