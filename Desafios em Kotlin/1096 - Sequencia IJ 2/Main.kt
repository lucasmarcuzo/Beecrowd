import java.util.*

fun main(args: Array<String>) {
    
    val scan = Scanner(System.`in`)

    val vet = intArrayOf(7, 6, 5)
    val vet2 = IntArray(15)
    
    for (i in 1 until 10 step 2) {
        var j = 0
    
        vet2[i] = i
    
        println("I=${vet2[i]} J=${vet[j]}")
        j++
        println("I=${vet2[i]} J=${vet[j]}")
        j++
        println("I=${vet2[i]} J=${vet[j]}")
    }
    
    scan.close()

	
}