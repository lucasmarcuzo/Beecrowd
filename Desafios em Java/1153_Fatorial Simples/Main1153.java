//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1153 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n, f, x; 
        x=f=1;

        n=scan.nextInt();

        while (x <= n)
        {
            f=f*x;
            x++;
        }

        System.out.println(f); 


        scan.close();
    
    }
}