//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1013 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int MaiorAB,MaiorABC;
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        MaiorAB = (a + b + Math.abs(a - b )) / 2;
        MaiorABC = (MaiorAB + c + Math.abs(MaiorAB - c)) / 2;
        System.out.println(MaiorABC + " eh o maior");

        scan.close();

    }
    
}
