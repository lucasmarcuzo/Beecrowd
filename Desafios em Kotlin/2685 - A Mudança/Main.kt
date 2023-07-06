import java.io.IOException
import java.util.Scanner

fun main(args: Array<String>) {
    
    val leitor = Scanner(System.`in`)
    while (leitor.hasNext()) {
    val graus = leitor.nextInt()
    
        when {
            graus >= 0 && graus < 90 -> println("Bom Dia!!")
            graus >= 90 && graus < 180 -> println("Boa Tarde!!")
            graus >= 180 && graus < 270 -> println("Boa Noite!!")
            graus >= 270 && graus < 360 -> println("De Madrugada!!")
            else -> println("Bom Dia!!")
        }
    }
    leitor.close()

}