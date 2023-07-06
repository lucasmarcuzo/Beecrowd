import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))

    var str: String? = br.readLine()

    while (str != null) {
        if (str.isEmpty()) {
            break
        } else {
            val x = str.toInt()

            if (x <= 0) {
                println("vai ter copa!")
            } else {
                println("vai ter duas!")
            }
        }

        str = br.readLine()
    }
}
