import java.util.*

fun main(args: Array<String>) {
    
    val scan = Scanner(System.`in`)

    var num: Int
    var horas: Int
    var salario: Double
    var total: Double
    
    num = scan.nextInt()
    horas = scan.nextInt()
    salario = scan.nextDouble()
    
    total = horas * salario
    
    println("NUMBER = $num")
    println("SALARY = U$ %.2f".format(total))
    
    scan.close()
}
