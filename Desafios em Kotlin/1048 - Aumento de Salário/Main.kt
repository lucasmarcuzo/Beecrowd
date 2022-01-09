//Developed by: @LucasMarcuzo

import java.util.*

fun main(args: Array<String>) {
   val input = Scanner(System.`in`);

   val salario = input.nextDouble();

   val reajuste = when {
       salario > 2000 -> 4
       salario <= 2000 && salario > 1200 -> 7 
       salario <= 1200 && salario > 800 -> 10
       salario <= 800 && salario > 400 -> 12
       else -> 15
   }

   val valorReajuste = (salario * reajuste / 100);
   val novoSalario = (salario + valorReajuste);

   System.out.printf("Novo salario: %.2f\n", novoSalario);
   System.out.printf("Reajuste ganho: %.2f\n",valorReajuste);
   System.out.printf("Em percentual: %d %%\n", reajuste);
}