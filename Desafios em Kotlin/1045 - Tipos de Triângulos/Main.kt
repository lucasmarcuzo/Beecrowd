import java.util.Scanner
import kotlin.math.pow

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)
    
    var a: Double
    var b: Double
    var c: Double
    var primeiro: Double
    var segundo: Double
    var terceiro: Double
    val valor = DoubleArray(4)

    a = scan.nextDouble()
    b = scan.nextDouble()
    c = scan.nextDouble()

    if (a >= b && a >= c) {
        primeiro = a
        segundo = b
        terceiro = c
    } else if (b >= a && b >= c) {
        primeiro = b
        segundo = a
        terceiro = c
    } else {
        primeiro = c
        segundo = a
        terceiro = b
    }

    valor[0] = primeiro.pow(2.0)
    valor[1] = segundo.pow(2.0)
    valor[2] = terceiro.pow(2.0)

    valor[3] = valor[1] + valor[2]

    if (primeiro >= segundo + terceiro) {
        println("NAO FORMA TRIANGULO")
    } 
    else {
        if (valor[0] == valor[3]) {
            println("TRIANGULO RETANGULO")
        }
        if (valor[0] > valor[3]) {
            println("TRIANGULO OBTUSANGULO")
        }
        if (valor[0] < valor[3]) {
            println("TRIANGULO ACUTANGULO")
        }
        if (valor[0] == valor[1] && valor[1] == valor[2]) {
            println("TRIANGULO EQUILATERO")
        }
        if (valor[0] == valor[1] && valor[0] != valor[2] && valor[2] != valor[1]) {
            println("TRIANGULO ISOSCELES")
        }
        if (valor[1] == valor[2] && valor[0] != valor[1] && valor[0] != valor[2]) {
            println("TRIANGULO ISOSCELES")
        }
        if (valor[0] == valor[2] && valor[2] != valor[1] && valor[0] != valor[1]) {
            println("TRIANGULO ISOSCELES")
        }
    }
    scan.close()
}
