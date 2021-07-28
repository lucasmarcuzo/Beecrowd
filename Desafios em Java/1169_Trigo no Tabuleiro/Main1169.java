//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1169 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n, i;
        double x;
            
        n = scan.nextInt();

        for(i = 0; i < n; i++){

            x = scan.nextDouble();

            System.out.printf("%d kg\n", (long)Math.floor(Math.pow(2,x)/12000));
        }

        scan.close();
    }   
}
