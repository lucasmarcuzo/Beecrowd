//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1118 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double m, n, calc=1;

        do
        {
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


            System.out.printf("media = %.2f\n",(m+n)/2);

            do
            {
                System.out.println("novo calculo (1-sim 2-nao)");
                calc=scan.nextInt();
                
            } while (calc != 1 && calc != 2);
            
        } while (calc == 1);

        scan.close();
    
    }
}