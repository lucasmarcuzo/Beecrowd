import java.util.*

fun main(args: Array<String>) {
    
    val scan = Scanner(System.`in`)

    var v: Int
    var i = 1
    var x = 1
    var z = 60
    
    while (i <= 13) {
        v = x
        x += 3
        i++
    
        println("I=$v J=$z")
        z -= 5
    }
    
    scan.close()

	
}