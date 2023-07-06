//Developed by: @LucasMarcuzo

import java.util.Scanner

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    var notes: Int
    var aux: Int
    
    notes = scan.nextInt()
    
    println("%d ano(s)".format(notes / 365))
    aux = notes % 365
    
    println("%d mes(es)".format(aux / 30))
    aux = aux % 30
    
    println("%d dia(s)".format(aux / 1))
    
    scan.close()

}
