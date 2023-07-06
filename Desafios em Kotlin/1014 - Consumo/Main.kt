import java.util.*

fun main(args: Array<String>) {
    
    val scan = Scanner(System.`in`)

    var x: Int
    var y: Double
    var total: Double
    
    x = scan.nextInt()
    y = scan.nextDouble()
    
    total = x.toDouble() / y
    
    println("%.3f km/l".format(total))
    
    scan.close()
	
}