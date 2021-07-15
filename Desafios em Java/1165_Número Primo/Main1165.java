//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1165 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n, x=0, y=0;

        n=scan.nextInt();

        for (int i = 1; i <= n; i++)
        {
            x=scan.nextInt();

            y=0;

            for (int j=1; j < x; j++)
            {
                if(x % j == 0)
                {
                    y+=j;
                } 
                
            }

            if(y == 1)
            {
                System.out.printf("%d eh primo\n",x);

            }else
            {
                System.out.printf("%d nao eh primo\n",x);
            }

        }



        scan.close();
    
    }
}