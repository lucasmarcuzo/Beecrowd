import java.io.IOException
import java.text.DecimalFormat
import java.util.Scanner

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`)

    val df = DecimalFormat("0.00")

    var V: Double
    var D: Double
    var R: Double
    var area: Double
    var altura: Double

    while (leitor.hasNext()) {
        V = leitor.nextDouble()
        D = leitor.nextDouble()
        R = D / 2
        area = 3.14 * R * R
        altura = V / area

        println("ALTURA = ${df.format(altura)}")
        println("AREA = ${df.format(area)}")
    }
}
