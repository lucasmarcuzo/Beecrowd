import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    val qtdTeste = scan.nextInt()

    var v1: String
    var v2: String

    for (i in 1..qtdTeste) {
        v1 = scan.next()
        v2 = scan.next()

        if ((v1 == "tesoura" && v2 == "papel") || (v1 == "papel" && v2 == "pedra")
            || (v1 == "pedra" && v2 == "lagarto") || (v1 == "lagarto" && v2 == "Spock")
            || (v1 == "Spock" && v2 == "tesoura") || (v1 == "tesoura" && v2 == "lagarto")
            || (v1 == "lagarto" && v2 == "papel") || (v1 == "papel" && v2 == "Spock")
            || (v1 == "Spock" && v2 == "pedra") || (v1 == "pedra" && v2 == "tesoura")
        ) {
            println("Caso #$i: Bazinga!")
        } else if (v1 == v2) {
            println("Caso #$i: De novo!")
        } else {
            println("Caso #$i: Raj trapaceou!")
        }
    }
}
