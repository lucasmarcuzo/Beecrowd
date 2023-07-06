//Developed by: @LucasMarcuzo

import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val senha = "2002"
    var senhauser: String

    do {
        senhauser = scan.nextLine()

        if (senha != senhauser) {
            println("Senha Invalida")
        }
    } while (senha != senhauser)

    println("Acesso Permitido")

    scan.close()
}