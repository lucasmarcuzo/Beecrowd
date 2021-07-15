//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1048 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double a, b=0, c=0;
        int  d=0;
        char ch='%';

        a=scan.nextDouble();

        if(a>=0 && a<=400.00)
        {
            b=a*0.15;
            c=a+b;
            d=15;

        }else if(a>=400.01 && a<=800.00){

            b=a*0.12;
            c=a+b;
            d=12;

        }else if(a>=800.01 && a<=1200.00){

            b=a*0.10;
            c=a+b;
            d=10;

        }else if(a>=1200.01 && a<=2000.00){

            b=a*0.07;
            c=a+b;
            d=7;

        }else if(a>2000.00){

            b=a*0.04;
            c=a+b;
            d=4;
        }

        System.out.printf("Novo salario: %.2f\n", c);
        System.out.printf("Reajuste ganho: %.2f\n",b);
        System.out.printf("Em percentual: %d %c\n", d, ch);

        scan.close();

    }
    
}