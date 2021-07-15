//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1044 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        int x, y;

        x = scan.nextInt();
        y = scan.nextInt();
    
        if(y % x == 0 || x % y == 0)
        {
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }
        scan.close();
    }        
}
