//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1005 { 

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double a, b, media;
        a=scan.nextDouble();
        b=scan.nextDouble();

        media=((a*3.5 + b*7.5)/(3.5+7.5));

        System.out.printf("MEDIA = %.5f\n", media);

        scan.close();
    }  
}
