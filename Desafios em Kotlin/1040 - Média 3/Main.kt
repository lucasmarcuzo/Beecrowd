import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    var n1: Float
    var n2: Float
    var n3: Float
    var n4: Float
    var media: Float
    var exame: Float

    n1 = scan.nextFloat()
    n2 = scan.nextFloat()
    n3 = scan.nextFloat()
    n4 = scan.nextFloat()

    media = ((n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / (2 + 3 + 4 + 1))

    if (media >= 7.0) {
        println("Media: %.1f".format(media))
        println("Aluno aprovado.")
    } else {
        if (media < 5.0) {
            println("Media: %.1f".format(media - 0.01))
            println("Aluno reprovado.")
        } else {
            println("Media: %.1f".format(media - 0.01))
            println("Aluno em exame.")
            exame = scan.nextFloat()
            println("Nota do exame: %.1f".format(exame))
            media = (media + exame) / 2
            if (media >= 5.0) {
                println("Aluno aprovado.")
            } else {
                println("Aluno reprovado.")
            }
            println("Media final: %.1f".format(media))
        }
    }
}
