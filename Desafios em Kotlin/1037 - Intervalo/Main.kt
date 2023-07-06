import java.util.*

fun main(args: Array<String>) {

   val scan = Scanner(System.`in`)

    var x: Float
    
    x = scan.nextFloat()
    
    if (x >= 0 && x <= 25.0000) {
        println("Intervalo [0,25]")
    } else if (x > 25.0000 && x <= 50.0000000) {
        println("Intervalo (25,50]")
    } else if (x > 50.0000000 && x <= 75.0000000) {
        println("Intervalo (50,75]")
    } else if (x > 75.0000000 && x <= 100.0000000) {
        println("Intervalo (75,100]")
    } else {
        println("Fora de intervalo")
    }
    
    scan.close()

}