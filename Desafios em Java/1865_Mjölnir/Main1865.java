//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1865 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String x;
        int y;
        int n=scan.nextInt();

        for (int i = 0; i < n; i++)
        {
            x = scan.next();
            y = scan.nextInt();

            if(x.equals("Thor")){

                System.out.println("Y");

            }else{

                System.out.println("N");
            }

        }

        scan.close();
    
    }
}