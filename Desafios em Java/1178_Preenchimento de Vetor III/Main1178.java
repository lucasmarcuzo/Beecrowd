//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1178 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double [] vet = new double [100];

        double x = scan.nextDouble();

        for(int i = 0; i < 100; i++)
        {
            vet[i] = x/(Math.pow(2, i));

            System.out.printf("N[%d] = %.4f\n",i, vet[i]);
        }

        scan.close();


        
    
    }
}