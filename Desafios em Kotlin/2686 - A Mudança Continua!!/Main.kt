import java.io.IOException
import java.util.Scanner

fun main(args: Array<String>) {
    
    val leitor = Scanner(System.`in`)
    var x: Float

    while (leitor.hasNext()) {

        val y = leitor.nextDouble()

        x = y.toInt().toFloat()
        val horas = ((y * 240) / 3600).toInt() % 60
        val minutos = ((y * 240) / 60).toInt() % 60
        val segundos = (y * 240).toInt() % 60

        when {
            x >= 0 && x < 90 || x == 360f -> println("Bom Dia!!\n%02d:%02d:%02d".format((horas + 6) % 24, minutos, segundos))
            x >= 90 && x < 180 -> println("Boa Tarde!!\n%02d:%02d:%02d".format((horas + 6) % 24, minutos, segundos))
            x >= 180 && x < 270 -> println("Boa Noite!!\n%02d:%02d:%02d".format((horas + 6) % 24, minutos, segundos))
            x >= 270 && x < 360 -> println("De Madrugada!!\n%02d:%02d:%02d".format((horas + 6) % 24, minutos, segundos))
        }
    }
    
    leitor.close()

}