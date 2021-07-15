//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main2146 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int s;

        for (int i = 1001; i <= 9999 ; i++)
        {
            s=scan.nextInt();
 
            System.out.printf("%d\n", s-1);
        }

        scan.close();
    
    }
}