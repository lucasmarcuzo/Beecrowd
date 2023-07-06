import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var num_album = 0
    var fig_compradas = 0

    num_album = scan.nextInt()

    fig_compradas = scan.nextInt()

    val figurinhas = IntArray(fig_compradas)

    for (i in figurinhas.indices) {
        var y = false
        val id = scan.nextInt()

        for (x in figurinhas) {
            if (x == id) {
                y = true
                break
            }
        }

        if (!y) {
            figurinhas[i] = id
            num_album--
        }
    }

    println(num_album)

    scan.close()
}