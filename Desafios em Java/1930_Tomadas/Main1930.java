//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1930 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int y=0;

        int[] x = new int[4];

        x[0]=scan.nextInt();
        x[1]=scan.nextInt();
        x[2]=scan.nextInt();
        x[3]=scan.nextInt();

        for (int i = 0; i < 3; i++)
        {
            y+=x[i]-1;    
        }

        System.out.printf("%d\n", y+x[3]);


        scan.close();
    
    }
}