//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1060 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int x=0;

        double[] vetor=new double[6];

        for(int i=0; i<vetor.length; i++)
        {
           vetor[i]=scan.nextDouble();
        }

        for (int i=0; i<vetor.length; i++)
        {
            if(vetor[i]>0){

                x++;
            }
        }

        System.out.printf("%d valores positivos\n", x);
        
        scan.close();

    }
    
}