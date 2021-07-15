//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1014 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int x;
        double y, total;

        x=scan.nextInt();
        y=scan.nextDouble();

        total=x/y;

        System.out.printf("%.3f km/l\n",total);
        
        scan.close();

    }
    
}