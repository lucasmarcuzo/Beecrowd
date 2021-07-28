//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1837 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int r = a % b;

        if(r < 0) 
        {
            r += Math.abs(b);
        }

        int q = (a - r) / b;
        
        System.out.printf("%d %d\n", q, r);

        scan.close();
    
    }
}