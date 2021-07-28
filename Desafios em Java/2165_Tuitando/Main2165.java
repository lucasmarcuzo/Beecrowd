//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main2165 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        int y=s.length();

        if(y <= 140)
        {
            System.out.println("TWEET");
        }
        else
        {
            System.out.println("MUTE");
        }

        scan.close();
    }      
}