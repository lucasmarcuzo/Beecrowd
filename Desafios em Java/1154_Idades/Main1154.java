//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1154 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int x, y=0, cont=0;

        do
        {
            x=scan.nextInt();

            if(x>0){
                y += x;
                cont++;
            }
            
        } while (x > 0);

        float z=(float)y/cont;

        System.out.printf("%.2f\n",z);


        scan.close();
    
    }
}