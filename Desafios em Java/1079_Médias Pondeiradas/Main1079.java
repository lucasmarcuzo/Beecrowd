//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1079 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n; 
        float x, y, z;

        n=scan.nextInt();
        
        float[] vet = new float[n];

        for (int i = 0; i < n; i++)
        {
            x=scan.nextFloat();
            y=scan.nextFloat();
            z=scan.nextFloat();

            vet[i]=(x*2 + y*3 + z*5)/10;
        }


        for (float j : vet)
        {
            System.out.printf("%.1f\n",j);
        }

        scan.close();

    }
    
}