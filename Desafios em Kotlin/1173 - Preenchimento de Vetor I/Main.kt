//Developed by: @LucasMarcuzo

import java.util.*

fun main(args: Array<String>) {
    val valor = readLine()!!.toInt()
    val vetor = IntArray(10).toMutableList()

    for (i in 0 until 10) {     
    
      vetor[i] = if(i == 0) valor
      else {
          vetor[i-1] * 2   
      }
      
    }
    
    for (j in 0 until 10) { 
        println("N[$j] = ${vetor[j]}") 
    }
}