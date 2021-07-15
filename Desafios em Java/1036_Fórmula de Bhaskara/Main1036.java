//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1036 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double a, b, c, r1, r2;

        a=scan.nextDouble();
        b=scan.nextDouble();
        c=scan.nextDouble();

        if((a == 0) || (((b*b) - (4*a*c)) < 0)) {
           
            System.out.println("Impossivel calcular");
        
        }else{
        
            r1 = ((-b + Math.sqrt(((b*b) - (4*a*c)))) / (2*a));
            r2 = ((-b - Math.sqrt(((b*b) - (4*a*c)))) / (2*a));

            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);

        }
        
        scan.close();

    } 
}