import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.ArrayList

fun main(args: Array<String>) {
    val t: MutableList<String> = ArrayList()
    val ir = InputStreamReader(System.`in`)
    val `in` = BufferedReader(ir)

    while (`in`.ready()) {
        val cpf = `in`.readLine()

        var verificar = 0
        var verificar2 = 0
        var teste1 = 1
        var teste2 = 9
        val cpf_ver = arrayOfNulls<String>(9)
        val cpf_ver2 = arrayOfNulls<String>(10)
        val cpf_completo = arrayOfNulls<String>(11)

        val cleanedCpf = cpf.replace("[()-.\"]".toRegex(), "")

        for (i in cpf_completo.indices) {
            cpf_completo[i] = cleanedCpf.substring(i, i + 1)
        }

        for (i in cpf_ver.indices) {
            cpf_ver[i] = cleanedCpf.substring(i, i + 1)
            verificar += Integer.parseInt(cpf_ver[i]) * teste1
            teste1++
        }

        verificar %= 11

        if (verificar == 10) {
            verificar = 0
        }

        for (j in cpf_ver2.indices) {
            cpf_ver2[j] = cleanedCpf.substring(j, j + 1)
            verificar2 += Integer.parseInt(cpf_ver2[j]) * teste2
            teste2--
        }

        verificar2 %= 11

        if (verificar2 == 10) {
            verificar2 = 0
        }

        var x = 0

        for (i in cpf_completo.indices) {
            val k = i + 1
            if (cpf_completo[i] == cpf_completo[k]) {
                x++
                if (x == 10) {
                    t.add("CPF valido")
                    break
                }
            } else if (cpf_completo[9] == verificar.toString() && cpf_completo[10] == verificar2.toString()) {
                t.add("CPF valido")
                break
            } else {
                t.add("CPF invalido")
                break
            }
        }
    }

    if (t.isNotEmpty()) {
        for (teste in t) {
            println(teste)
        }
    }
}
