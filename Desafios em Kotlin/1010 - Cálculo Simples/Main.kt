import java.util.*

fun main(args: Array<String>) {
    
    val scan = Scanner(System.`in`)

    val cod1 = scan.nextInt()
    val qtd1 = scan.nextInt()
    val valor1 = scan.nextDouble()
    
    val cod2 = scan.nextInt()
    val qtd2 = scan.nextInt()
    val valor2 = scan.nextDouble()
    
    val total = (valor1 * qtd1) + (valor2 * qtd2)
    
    println("VALOR A PAGAR: R$ %.2f".format(total))
    
    scan.close()
}
