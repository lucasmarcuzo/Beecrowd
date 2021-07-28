//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1155 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double s = 1;

        for (int i = 2; i <= 100; i++)
        {
            s += (double)1/i;
        }

       System.out.printf("%.2f\n", s);


        scan.close();
    
    }
}