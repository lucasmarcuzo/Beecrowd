import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)
    sc.useLocale(Locale.ENGLISH)
    Locale.setDefault(Locale("en", "US"))

    val N = sc.nextLine().toInt()

    for (i in 0 until N) {
        val entrada = sc.nextLine().split(" ")
        val fr1 = entrada[0].toCharArray()
        val fr2 = entrada[1].toCharArray()
        var saida = ""

        for (z in 0 until (fr1.size + fr2.size)) {
            if (z < fr1.size)
                saida += fr1[z]
            if (z < fr2.size)
                saida += fr2[z]
        }
        println(saida)
    }
}
