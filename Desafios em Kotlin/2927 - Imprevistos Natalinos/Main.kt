import java.io.IOException
import java.util.Scanner

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`)

    val numAlunos = leitor.nextInt()
    val numPc = leitor.nextInt()
    val qtsPcsQuebrados = leitor.nextInt()
    val qtsPcsSemComp = leitor.nextInt()

    if (numPc - (numAlunos + qtsPcsQuebrados + qtsPcsSemComp + 1) >= 0) {
        println("Igor feliz!")
    } else {
        if (qtsPcsSemComp / 2 < qtsPcsQuebrados) {
            println("Caio, a culpa eh sua!")
        } else {
            println("Igor bolado!")
        }
    }

    leitor.close()
}
