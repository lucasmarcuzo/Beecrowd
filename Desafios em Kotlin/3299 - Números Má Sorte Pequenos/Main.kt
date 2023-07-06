import java.io.IOException
import java.util.Scanner

fun main(args: Array<String>) {
    
    val scan = Scanner(System.`in`)
    
    val num = scan.nextLong().toString()
    
    if (num.contains("13")) {
        println("$num es de Mala Suerte")
    } else {
        println("$num NO es de Mala Suerte")
    }
    
    scan.close()



}