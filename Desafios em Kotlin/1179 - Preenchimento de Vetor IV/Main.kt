import java.io.IOException
import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val numsPares: Queue<Int> = LinkedList()
    val numsImpares: Queue<Int> = LinkedList()
    var impares = 0
    var pares = 0

    for (i in 0 until 15) {
        val x = scan.nextInt()

        if (x % 2 == 0) {
            numsPares.add(x)
            pares++
        } else {
            numsImpares.add(x)
            impares++
        }

        if (impares == 5) {
            for (j in 0 until 5) {
                println("impar[$j] = ${numsImpares.poll()}")
                impares = 0
            }
        } else if (pares == 5) {
            for (j in 0 until 5) {
                println("par[$j] = ${numsPares.poll()}")
                pares = 0
            }
        }
    }

    var imparIndex = 0
    var parIndex = 0
    while (!numsImpares.isEmpty()) {
        println("impar[$imparIndex] = ${numsImpares.poll()}")
        imparIndex++
    }
    while (!numsPares.isEmpty()) {
        println("par[$parIndex] = ${numsPares.poll()}")
        parIndex++
    }
}
