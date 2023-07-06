//Developed by: @LucasMarcuzo

import java.io.IOException
import java.util.ArrayList
import java.util.Collections
import java.util.Scanner

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    val numerosImpares = ArrayList<Int>()
    val numerosPares = ArrayList<Int>()
    
    val N = scan.nextInt()
    
    for (i in 0 until N) {
        val numero = scan.nextInt()
        if (numero % 2 == 0) {
            numerosPares.add(numero)
        } else {
            numerosImpares.add(numero)
        }
    }
    
    Collections.sort(numerosImpares)
    Collections.sort(numerosPares)
    
    for (i in numerosPares) {
        println(i)
    }
    
    for (i in numerosImpares.size - 1 downTo 0) {
        println(numerosImpares[i])
    }
    
    scan.close()

}
