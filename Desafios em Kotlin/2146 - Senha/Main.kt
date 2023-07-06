import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    var s: Int

    for (i in 1001..9999) {
        s = scan.nextInt()
        println(s - 1)
    }

    scan.close()
	
}