//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main3299 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String num = Long.toString(scan.nextLong());

        if (num.contains("13")) {

            System.out.printf("%s es de Mala Suerte\n",num);
        }
        else {

            System.out.printf("%s NO es de Mala Suerte\n",num);
        }




        scan.close();
    
    }
}