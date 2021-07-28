//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1164 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        for (int i = 0; i < x; i++)
        {
            int valor = 0, total = 0;

            valor = scan.nextInt();

            for (int j = 1; j < valor; j++)
            {
                if (valor % j == 0)
                {
                    total += j;
                }     
            }

            if(valor == total)
            {
                System.out.printf("%d eh perfeito\n",valor);
            }
            else
            {
                System.out.printf("%d nao eh perfeito\n",valor);
            }



        }



        scan.close();
    
    }
}