//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1073 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int x, y=2;

        x=scan.nextInt();

        for(int i=1; i<=x; i++)
        {
            if(i % 2 == 0){

               System.out.printf("%d^%d = %d\n",i,y,(int)Math.pow(i,2));
            }
        }

        scan.close();

    }
    
}