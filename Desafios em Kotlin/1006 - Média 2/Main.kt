//Developed by: @LucasMarcuzo

import java.util.Scanner

fun main(args: Array<String>) {
    
    val input = Scanner(System.`in`)
    val nota1 = input.nextDouble()
    val nota2 = input.nextDouble()
    val nota3 = input.nextDouble()
    
    val media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (10) 
    
    System.out.printf("MEDIA = %.1f\n", media)
}