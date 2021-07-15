//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1117 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double m, n, t;

        do
        {
            m=scan.nextDouble();

            if(m < 0.0f || m > 10.0f)
            {
                System.out.println("nota invalida");
            }
            
        } while (m < 0.0f || m > 10.0f);

        do
        {
            n=scan.nextDouble();

            if(n < 0.0f || n > 10.0f)
            {
                System.out.println("nota invalida");
            }
    
        } while (n < 0.0f || n > 10.0f);

       
        t=(m+n)/2;

        System.out.printf("media = %.2f\n",t);

        scan.close();
    
    }
}