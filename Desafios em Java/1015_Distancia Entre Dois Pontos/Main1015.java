//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1015 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double distancia, x, y;

        double x1=scan.nextDouble();
        double y1=scan.nextDouble();
        double x2=scan.nextDouble();
        double y2=scan.nextDouble();
        
        distancia = Math.sqrt(Math.pow(x=(x2-x1),2) + Math.pow(y=(y2-y1),2));

        System.out.printf("%.4f\n",distancia);
        
        scan.close();

    }
    
}