//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1134 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n, a, b, c;
        n=a=b=c=0;

        do
        {   
            n=scan.nextInt();

            if(n >=1 && n <= 3){

                if(n == 1){
                    a++;
                }else if(n == 2){
                    b++;
                }else if(n == 3){
                    c++;
                }

            }
            
        } while (n != 4);

       System.out.println("MUITO OBRIGADO");
       System.out.printf("Alcool: %d\n", a);
       System.out.printf("Gasolina: %d\n", b);
       System.out.printf("Diesel: %d\n", c);


        scan.close();
    
    }
}