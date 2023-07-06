import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    var x: Float
    var y: Float
    val z = 0.0f

    x = scan.nextFloat()
    y = scan.nextFloat()

    if (x == z && y == z) {
        println("Origem")
    } else if (x == z) {
        println("Eixo Y")
    } else if (y == z) {
        println("Eixo X")
    } else if (x > z && y > z) {
        println("Q1")
    } else if (x < z && y > z) {
        println("Q2")
    } else if (x < z && y < z) {
        println("Q3")
    } else if (x > z && y < z) {
        println("Q4")
    }
    scan.close()
}
