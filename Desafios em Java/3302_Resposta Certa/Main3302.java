//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main3302 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int j = 1;
        int x = scan.nextInt();

        int[] vet = new int[x];

        for (var i = 0; i < vet.length; i++)
        {
            vet[i]=scan.nextInt();
        }

        for (var vl : vet)
        {
            System.out.printf("resposta %d: %d\n",j,vl);
            j++;
        }

        scan.close();
    
    }
}