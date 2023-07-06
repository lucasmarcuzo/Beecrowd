import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val meses = arrayOf("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December")

    var i = scan.nextInt()

    i--
    println(meses[i])

    scan.close()
}
