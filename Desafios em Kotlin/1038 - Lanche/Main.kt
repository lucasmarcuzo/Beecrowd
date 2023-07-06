import java.util.Scanner

fun main(args: Array<String>) {
    
    val scan = Scanner(System.`in`)

    var x: Int
    var y: Int
    var z: Double
    val cod = intArrayOf(1, 2, 3, 4, 5)
    val valor = doubleArrayOf(4.00, 4.50, 5.00, 2.00, 1.50)
    
    x = scan.nextInt()
    y = scan.nextInt()
    
    when (x) {
        cod[0] -> {
            z = y * valor[0]
            println("Total: R$ %.2f".format(z))
        }
        cod[1] -> {
            z = y * valor[1]
            println("Total: R$ %.2f".format(z))
        }
        cod[2] -> {
            z = y * valor[2]
            println("Total: R$ %.2f".format(z))
        }
        cod[3] -> {
            z = y * valor[3]
            println("Total: R$ %.2f".format(z))
        }
        cod[4] -> {
            z = y * valor[4]
            println("Total: R$ %.2f".format(z))
        }
    }
    
    scan.close()

}