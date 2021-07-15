//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1095 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int v, i=1, x=1, z=60;
        
        while (i <= 13)
        {
            v=x;
            x=x+3;
            i++;

            System.out.printf("I=%d J=%d\n",v,z);
            z-=5;
        }
    
        scan.close();

    }
    
}