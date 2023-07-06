//Developed by: @LucasMarcuzo

import java.util.Scanner

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    var a: Int
    var b: Int
    var c: Int
    var d: Int
    
    a = scan.nextInt()
    b = scan.nextInt()
    c = scan.nextInt()
    d = scan.nextInt()
    
    val cd = c + d
    val ab = a + b
    
    if (b > c && d > a && cd > ab && c > 0 && d > 0) {
        if (a % 2 == 0) {
            println("Valores aceitos")
        } else {
            println("Valores nao aceitos")
        }
    } else {
        println("Valores nao aceitos")
    }
    
    scan.close()

}
