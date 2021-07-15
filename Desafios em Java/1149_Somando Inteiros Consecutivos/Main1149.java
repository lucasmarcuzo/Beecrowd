//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1149 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int a, n=0, i=1, x=0;

        a = scan.nextInt();
        n = scan.nextInt();
        
        
        while (n <= 0)
        {
            i = i + 1; 
            n = scan.nextInt();
        }
        
        
        for(int j = 0; j < n; j++) 
        {
            x=x+a+j;
        }

        System.out.println(x);


        scan.close();
    
    }
}