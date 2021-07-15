//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1173 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int x;

        int[] vet = new int[10];

        x=scan.nextInt();

        for (int i = 0; i < 10; i++)
        {
            vet[i]=x;
            System.out.printf("N[%d] = %d\n", i, vet[i]);
            x=x*2;
        }


        scan.close();
    
    }
}