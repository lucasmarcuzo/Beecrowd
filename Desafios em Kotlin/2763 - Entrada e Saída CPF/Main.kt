import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    val cpf = scan.next().replace(".", "").replace("-", "")

    val cpf_completo = arrayOfNulls<String>(4)

    cpf_completo[0] = cpf.substring(0, 3)
    cpf_completo[1] = cpf.substring(3, 6)
    cpf_completo[2] = cpf.substring(6, 9)
    cpf_completo[3] = cpf.substring(9, 11)

    for (i in cpf_completo) {
        println(i)
    }

    scan.close()
}