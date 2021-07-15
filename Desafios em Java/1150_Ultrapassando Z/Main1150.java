//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1150 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int x, z, y, i=0;

        x=scan.nextInt();

        do
        {
            z=scan.nextInt();

        } while (z <= x);

            y=x;
            x=0;

            while (x <= z)
            {
                x+=y++;
                i++;
            } 

        
        System.out.println(i);


        scan.close();
    
    }
}