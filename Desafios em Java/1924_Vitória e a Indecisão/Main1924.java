//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1924 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        final int x=scan.nextInt();

        String[] l = new String[x];

        for (int i = 0; i < x; i++)
        {
            l[i] = scan.next();
        }    

        System.out.println("Ciencia da Computacao");

        scan.close();
   
    }
}