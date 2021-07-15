//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1006 { 

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double a, b, c, media;

        a=scan.nextDouble();
        b=scan.nextDouble();
        c=scan.nextDouble();
    
        media=((a*2.0)+(b*3.0)+(c*5.0))/10.0;
        
        System.out.printf("MEDIA = %.1f\n",media);

        scan.close();
    }  
}
