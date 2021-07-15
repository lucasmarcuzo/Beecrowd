//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1175 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] vet = new int[20];

        int j=0;

        for (int i = 0; i <vet.length; i++)
        {
            vet[i]=scan.nextInt();
        }
             
        int[] rev = new int[20];

        for (int i = 0, k = 19; i < 20; i++, k--) {          
            rev[i]=vet[k];
        }

        for(int n : rev)
        { 
            System.out.printf("N[%d] = %d\n", j, n);
            j++;
        }

        scan.close();
    
    }
}