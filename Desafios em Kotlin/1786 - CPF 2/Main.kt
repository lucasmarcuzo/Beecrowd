import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val ir = InputStreamReader(System.`in`)
    val `in` = BufferedReader(ir)

    while (`in`.ready()) {
        val cpf = `in`.readLine()

        var verificar = 0
        var verificar2 = 0
        var teste1 = 1
        var teste2 = 9
        val cpf_ver = arrayOfNulls<String>(9)
        val cpf_ver2 = arrayOfNulls<String>(9)

        for (i in cpf_ver.indices) {
            cpf_ver[i] = cpf.substring(i, i + 1)
            verificar += Integer.parseInt(cpf_ver[i]) * teste1
            teste1++
        }

        verificar %= 11

        if (verificar == 10) {
            verificar = 0
        }

        for (j in cpf_ver2.indices) {
            cpf_ver2[j] = cpf.substring(j, j + 1)
            verificar2 += Integer.parseInt(cpf_ver2[j]) * teste2
            teste2--
        }

        verificar2 %= 11

        if (verificar2 == 10) {
            verificar2 = 0
        }

        var teste = ""

        for (i in cpf_ver.indices) {
            teste += cpf_ver[i]
            if (i == 2 || i == 5) {
                teste += "."
            } else if (i == 8) {
                teste += "-"
            }
        }

        teste += verificar.toString() + verificar2.toString()

        println(teste)
    }
}
