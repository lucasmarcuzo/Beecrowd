import java.util.*

fun main(args: Array<String>) {

    while (true) {
        val input = readLine() ?: break
        val tokens = input.split(" ")
        val alturaPlaca = tokens[0].toInt()
        val larguraPlaca = tokens[1].toInt()
        val qtsPedidos = tokens[2].toInt()

        var i = 0
        while (i < qtsPedidos) {
            val pciInput = readLine() ?: break
            val pciTokens = pciInput.split(" ")
            val alturaPci = pciTokens[0].toInt()
            val larguraPci = pciTokens[1].toInt()

            if ((alturaPci <= alturaPlaca && larguraPci <= larguraPlaca) || (alturaPci <= larguraPlaca && larguraPci <= alturaPlaca))
                println("Sim")
            else
                println("Nao")

            i++
        }
    }
	
}