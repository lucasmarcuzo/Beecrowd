import java.util.*

fun main(args: Array<String>) {

    for (i in 1 until 40) {
        print("-")
    }

    for (i in 0 until 5) {
        println()
        for (j in 1 until 40) {

            if (j == 1 || j == 39) {
                print("|")
            } else {
                print(" ")
            }
        }
    }

    println()
    for (i in 1 until 40) {
        print("-")
    }
    println()
}