//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1064 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double x=0, y=0, cont=0, z=0.0;
        double[] vetor = new double[6];

        for (int i = 0; i < vetor.length; i++)
        {   
            vetor[i]=scan.nextDouble();

            if(vetor[i] > z){

                x = x + vetor[i];
                cont++;
                y = (double)x/cont;
            }
        }
        
        
        System.out.printf("%d valores positivos\n", (int)cont);
        System.out.printf("%.1f\n", y);
        
        scan.close();

    }
    
}