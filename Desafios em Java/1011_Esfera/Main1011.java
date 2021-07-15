import java.util.Scanner;

public class Main1011 {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double r, v=(4/3.0), i=3.14159, total;

        double vol=v;
        double pi=i;
        r=scan.nextDouble();
        r=(Math.pow(r, 3));

        total=vol*pi*r;

        System.out.printf("VOLUME = %.3f\n", total);

        scan.close();
    }

}
