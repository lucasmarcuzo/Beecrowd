//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1143 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n;

        n=scan.nextInt();

        for (int i = 1; i <= n; i++){

            System.out.printf("%d %d %d\n", i, (int)Math.pow(i, 2), (int)Math.pow(i, 3));
            
        }

        scan.close();
    
    }
}