//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1177 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int m, z=1000;

        m=scan.nextInt();
 
        int[] vet=new int[m];
 
        for (int i = 0; i < m; i++)
        {
            vet[i]=i;
        }
 
        for (int v=0, j=0; v < z; v++)
        {
             System.out.printf("N[%d] = %d\n", v, vet[j]);
             j++;
 
             if(j == m)
             {
                 j=0;
             }
        }


        scan.close();
    
    }
}