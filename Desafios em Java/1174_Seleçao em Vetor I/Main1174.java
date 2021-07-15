//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1174 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int i=0;

        double[] vet = new double[100];

        do
        {
            vet[i]=scan.nextDouble();
            i++;

        } while (i < 100);
        

        for (int j = 0; j < vet.length; j++)
        {
            if(vet[j] <= 10){

                System.out.printf("A[%d] = %.1f\n", j, vet[j]);    
            }   
        }


        scan.close();
    
    }
}