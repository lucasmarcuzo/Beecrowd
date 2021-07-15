//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1037 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        float x;

        x=scan.nextFloat();

        if (x >= 0 && x <= 25.0000){

            System.out.println("Intervalo [0,25]");

        }else if(x >= 25.00001  && x <= 50.0000000){

            System.out.println("Intervalo (25,50]");

        }else if(x >= 50.0000001  && x <= 75.0000000){

            System.out.println("Intervalo (50,75]");

        }else if(x >= 75.0000001  && x <= 100.0000000){

            System.out.println("Intervalo (75,100]");

        }else{

            System.out.println("Fora de intervalo");
        }
        
        scan.close();

    } 
}