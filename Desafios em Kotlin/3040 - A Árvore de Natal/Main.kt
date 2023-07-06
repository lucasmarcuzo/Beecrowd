import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    val ts = scan.nextInt()

    for (i in 0 until ts) {
        val altura = scan.nextInt()
        val diametro = scan.nextInt()
        val galhos = scan.nextInt()

        if (altura >= 200 && altura <= 300) {
            if (diametro >= 50) {
                if (galhos > 150) {
                    println("Sim")
                } else {
                    println("Nao")
                }
            } else {
                println("Nao")
            }
        } else {
            println("Nao")
        }
    }

    scan.close()
}