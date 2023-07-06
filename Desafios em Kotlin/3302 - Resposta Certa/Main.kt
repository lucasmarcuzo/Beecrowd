import java.io.IOException
import java.util.Scanner

fun main(args: Array<String>) {
    
    val scan = Scanner(System.`in`)
    
    var j = 1
    val x = scan.nextInt()
    
    val vet = IntArray(x)
    
    for (i in vet.indices) {
        vet[i] = scan.nextInt()
    }
    
    for (vl in vet) {
        println("resposta $j: $vl")
        j++
    }
    
    scan.close()




}