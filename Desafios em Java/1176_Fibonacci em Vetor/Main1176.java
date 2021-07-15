//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1176 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        long n1=0, n2=1, n3=0;

        int x=scan.nextInt();

        long[] vet = new long[61];

        int[] vety = new int[x];

        for (int i = 0; i < x; i++)
        {
            vety[i]=scan.nextInt();
        }
         
        for (int j = 1; j < 61; j++)
        {
            n1=n2;
            n2=n3;
            n3=n1+n2;
            vet[j]=(long)n3;
        }

        for (int m = 0; m < x;) {

            for (int k = 0; k < 61; k++) {

                if(vety[m] == k){
                         
                    String strLong = Long.toString(vet[k]);
                    System.out.printf("Fib(%d) = %s\n", vety[m], strLong);
                }    
            }
            m++;  
        }

       
        
        scan.close();
    
    }
}