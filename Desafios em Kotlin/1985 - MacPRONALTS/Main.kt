import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n: Int = scan.nextInt()
    val vet_cod = intArrayOf(1001, 1002, 1003, 1004, 1005)
    val vet_val = doubleArrayOf(1.50, 2.50, 3.50, 4.50, 5.50)

    var result = 0.0

    for (i in 0 until n) {
        val cod: Int = scan.nextInt()
        val qtd: Int = scan.nextInt()

        for (j in vet_val.indices) {
            if (cod == vet_cod[j]) {
                result += vet_val[j] * qtd
            }
        }
    }

    System.out.printf("%.2f\n", result)

    scan.close()
}
