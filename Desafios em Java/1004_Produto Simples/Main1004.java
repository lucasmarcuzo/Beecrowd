//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1004 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
    
        int a, b, PROD=0;
 
        a=scan.nextInt();
        b=scan.nextInt();

        PROD=a*b;

        System.out.printf("PROD = %d\n",PROD);

        scan.close();
    }  
}
