import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    val chico = 300 * scan.nextInt()
    val bento = 1500 * scan.nextInt()
    val bernardo = 600 * scan.nextInt()
    val marina = 1000 * scan.nextInt()
    val iara = 150 * scan.nextInt()
    val marlene = 225
    val total = chico + bento + bernardo + marina + iara + marlene

    println(total)

    scan.close()
}