//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1589 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n=scan.nextInt();

        for (int i = 0; i < n; i++)
        {
            int t =0, r1=0, r2=0;

            r1 = scan.nextInt();
            r2 = scan.nextInt();

            t=r1+r2;

            System.out.println(t);
        
        }



        scan.close();
    
    }
}