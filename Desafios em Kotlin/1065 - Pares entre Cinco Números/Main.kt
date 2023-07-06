import java.util.Scanner

fun main(args: Array<String>){

    val scan = Scanner(System.`in`)

    var x = 0

    val vetor = IntArray(5)

    for (i in vetor.indices) {
        vetor[i] = scan.nextInt()
    }

    for (i in vetor.indices) {
        if (vetor[i] % 2 == 0) {
            x++
        }
    }

    println("$x valores pares")
    scan.close()
}
