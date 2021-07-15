//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1052 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String[] meses = {"January","February","March","April","May","June","July","August","September","October","November","December"};

        int i=scan.nextInt();

        i--;
        System.out.println(meses[i]);
        
        scan.close();

    }
    
}