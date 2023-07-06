import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    var x: Int
    var total: Int
    
    x = scan.nextInt()
    
    total = x * 2
    
    println("%d minutos".format(total))
    
    scan.close()
}