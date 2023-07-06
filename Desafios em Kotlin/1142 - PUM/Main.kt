import java.util.Scanner

fun main(args: Array<String>) {

    val n: Int = readLine()!!.toInt()

    for (i in 1..n*4 step 4) {
        println("$i ${i+1} ${i+2} PUM")
    }
}
