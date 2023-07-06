import java.io.IOException
import java.text.DecimalFormat

fun main(args: Array<String>) {
    val df = DecimalFormat("#,##0.00")

    val x = 234.345
    val y = 45.698

    println("%.6f - %.6f".format(x, y))
    println("%d - %d".format(x.toInt(), y.toInt()+1))
    println("%.1f - %.1f".format(x, y))
    println("%s - %s".format(df.format(x), df.format(y)))
    println("%.3f - %.3f".format(x, y))
    println("%.6e - %.6e".format(x, y))
    println("%.6E - %.6E".format(x, y))
    println("%.3f - %.3f".format(x, y))
    println("%.3f - %.3f".format(x, y))
}
