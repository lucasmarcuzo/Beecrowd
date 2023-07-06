import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var A: String
    var B: String
    var C: String

    A = scan.next()
    B = scan.next()
    C = scan.next()

    if (A == "vertebrado" && B == "ave" && C == "carnivoro") {
        println("aguia")
    }
    if (A == "vertebrado" && B == "ave" && C == "onivoro") {
        println("pomba")
    }
    if (A == "vertebrado" && B == "mamifero" && C == "onivoro") {
        println("homem")
    }
    if (A == "vertebrado" && B == "mamifero" && C == "herbivoro") {
        println("vaca")
    }
    if (A == "invertebrado" && B == "inseto" && C == "hematofago") {
        println("pulga")
    }
    if (A == "invertebrado" && B == "inseto" && C == "herbivoro") {
        println("lagarta")
    }
    if (A == "invertebrado" && B == "anelideo" && C == "hematofago") {
        println("sanguessuga")
    }
    if (A == "invertebrado" && B == "anelideo" && C == "onivoro") {
        println("minhoca")
    }

    scan.close()
}
