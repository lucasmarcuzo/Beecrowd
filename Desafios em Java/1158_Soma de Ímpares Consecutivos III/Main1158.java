//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1158 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n, x, y, z, j;

        n=scan.nextInt();

        for (int i = 0; i < n; i++)
        {
            x = scan.nextInt();
            y = scan.nextInt();
            
            z=0;
            j=0;

            do
            {
                if(x % 2 != 0)
                {
                    z+=x;
                    j++;
                }
                x++;
                
            } while (j != y); 

            System.out.println(z);
        }



        scan.close();
    
    }
}