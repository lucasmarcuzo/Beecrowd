//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1132 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int x, y, soma = 0, i, aux = 0;

        x=scan.nextInt();
        y=scan.nextInt();
        
        if (y < x){

            aux = x;
            x = y;
            y = aux;
        }

        for (i = x; i <= y; i++)
        {

            if (i % 13 != 0){

            soma += i;

            }
        }

        System.out.println(soma);

        scan.close();
    
    }
}