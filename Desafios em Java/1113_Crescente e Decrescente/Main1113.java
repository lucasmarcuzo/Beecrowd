//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1113 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int x, y;

        do
        {
            x = scan.nextInt();
            y = scan.nextInt();

            if(x > y){

                System.out.println("Decrescente");

            }else if(x < y){

                System.out.println("Crescente");
            }
            
        } while (x != y);

        scan.close();
    
    }
}