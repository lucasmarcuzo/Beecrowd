//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1180 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n, y=1000, z=0;

        n=scan.nextInt();

        int[] vet = new int[n];

        for (int i = 0; i <vet.length; i++)
        {
            vet[i] = scan.nextInt();

            if(vet[i] < y)
            {
                y = vet[i];
                z=i;
            }
        }

        System.out.printf("Menor valor: %d\n", y);
        System.out.printf("Posicao: %d\n", z);

        scan.close();
    
    }
}