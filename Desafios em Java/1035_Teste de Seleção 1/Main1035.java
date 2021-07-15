//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1035 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int a, b, c, d;

        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        d=scan.nextInt();

        int cd=c+d;
        int ab=a+b;

        if(b > c && d > a && cd > ab && c > 0 && d > 0){

            if(a % 2 == 0){

                System.out.println("Valores aceitos");

            }else{

                System.out.println("Valores nao aceitos");
            }     
        }else{

            System.out.println("Valores nao aceitos");
        }    
        
        scan.close();

    } 
}