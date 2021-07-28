//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main3303 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String palavra = scan.next().toLowerCase();

        if(palavra.length() <= 20)
        {
            if(palavra.length() >= 10)
            {
                System.out.println("palavrao");
            }
            else
            {
                System.out.println("palavrinha");
            }
        }


        scan.close();
    
    }
}