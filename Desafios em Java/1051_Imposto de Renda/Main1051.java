//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1051 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double x=0;

        x=scan.nextDouble();
 
        if (x <= 2000.00f)
        {
            System.out.println("Isento");
        }
        else if (x <= 3000.00f)
        {
            x -= 2000.00f;
            x *= 0.08;
            System.out.printf("R$ %.2f\n",x);
        }
        else if (x <= 4500.00f)
        {
            x -= 3000.00f;
            x *= 0.18;
            x += (1000 * 0.08);
            System.out.printf("R$ %.2f\n",x);
        }
        else
        {
            x -= 4500.00f;
            x *= 0.28;
            x += (1500 * 0.18) + (1000 * 0.08) ;
            System.out.printf("R$ %.2f\n",x);
 
        }

        scan.close();

    }
    
}