//Developed by: @LucasMarcuzo

import java.io.IOException
import java.util.Scanner
import java.util.TreeMap

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    val carnes = TreeMap<Int, String>()
    
    while (scan.hasNext()) {
        val numPecasCarne = scan.nextInt()
    
        for (i in 0 until numPecasCarne) {
            val nomeCarne = scan.next()
            val dataValidade = scan.nextInt()
    
            carnes[dataValidade] = nomeCarne
        }
    
        println(carnes.values.joinToString(" "))
        carnes.clear()
    }
    
    scan.close()

}
