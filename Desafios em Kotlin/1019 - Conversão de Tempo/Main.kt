//Developed by: @LucasMarcuzo

import java.util.Scanner

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    var tempo: Int
    
    tempo = scan.nextInt()
    
    val hora = tempo / 3600
    tempo = tempo - (hora * 3600)
    
    val min = tempo / 60
    tempo = tempo - (min * 60)
    
    println("%d:%d:%d".format(hora, min, tempo))
    
    scan.close()



}
