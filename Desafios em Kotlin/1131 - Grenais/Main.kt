//Developed by: @LucasMarcuzo

import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var x: Int
    var y: Int
    var i: Int
    var g: Int
    var e: Int
    var s: Int
    var grenais: Int
    i = 0;
    grenais = 0;
    g = 0;
    e = 0;
    

    do {
        x = scan.nextInt()
        y = scan.nextInt()

        if (x > y) {
            i++
            grenais++
        } else if (y > x) {
            g++
            grenais++
        } else {
            e++
            grenais++
        }

        println("Novo grenal (1-sim 2-nao)")
        s = scan.nextInt()

    } while (s == 1)


    if (i > g) {
        println("$grenais grenais")
        println("Inter:$i")
        println("Gremio:$g")
        println("Empates:$e")
        println("Inter venceu mais")

    } else if (g > i) {
        println("$grenais grenais")
        println("Inter:$i")
        println("Gremio:$g")
        println("Empates:$e")
        println("Gremio venceu mais")

    } else {
        println("$grenais grenais")
        println("Inter:$i")
        println("Gremio:$g")
        println("Empates:$e")
        println("Nao houve vencedor")
    }

    scan.close()
}