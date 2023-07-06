import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    var horas: Int
    var velocidade: Int
    var distancia: Double
    val combustivel = 12.0
    
    horas = scan.nextInt()
    velocidade = scan.nextInt()
    
    distancia = (velocidade * horas) / combustivel
    
    println("%.3f".format(distancia))
    
    scan.close()
	
}