//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1065 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int x=0;

        int[] vetor = new int[5];

        for(int i=0; i<vetor.length; i++)
        {
           vetor[i]=scan.nextInt();
        }

        for(int i=0; i<vetor.length; i++)
        {
            if(vetor[i] % 2 == 0){
               x++;
            }
        }

        System.out.printf("%d valores pares\n", x);    
        scan.close();

    }
    
}