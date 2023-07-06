import java.io.IOException
import java.util.Scanner

fun main(args: Array<String>) {
    
    val leitor = Scanner(System.`in`)
    val a = leitor.nextInt()
    val b = leitor.nextInt()
    val c = leitor.nextInt()

    if (a + b == c || a + c == b || b + c == a || a == b || b == c || a == c) {
        println("S")
    } 
    else {
        println("N")
    }
}