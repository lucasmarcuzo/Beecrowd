import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.io.PrintWriter

fun main(args: Array<String>) {
    val `in` = BufferedReader(InputStreamReader(System.`in`))
    val out = PrintWriter(System.out)

    val casos = `in`.readLine().toInt()

    for (i in 0 until casos) {
        val P = `in`.readLine().split("\\s".toRegex()).toTypedArray()

        val primeiro = P[0]
        val segundo = P[1]

        val tam = primeiro.length - segundo.length

        if (primeiro.length < segundo.length) {
            out.println("nao encaixa")
        } else {
            out.println(if (primeiro.startsWith(segundo, tam)) "encaixa" else "nao encaixa")
        }
    }

    out.close()
}
