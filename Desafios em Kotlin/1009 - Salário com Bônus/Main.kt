import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var salario: Double
    var totalVendas: Double
    var total: Double
    var nome: String = ""
    
    nome = scan.next()
    salario = scan.nextDouble()
    totalVendas = scan.nextDouble()
    
    total = salario + (totalVendas * 0.15)
    
    println("TOTAL = R$ %.2f".format(total))
}
