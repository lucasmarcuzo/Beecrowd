//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main2862 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int c = scan.nextInt();

        for (var i = 0; i < c; i++)
        {
            int x = scan.nextInt();

            if(x > 8000)
            {
                System.out.println("Mais de 8000!");
            }
            else
            {
                System.out.println("Inseto!");
            }
        }

        scan.close();
    
    }
}