//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main2936 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int chico = 300 * scan.nextInt();
        int bento = 1500 * scan.nextInt();
        int bernardo = 600 * scan.nextInt();
        int marina = 1000 * scan.nextInt();
        int iara = 150 * scan.nextInt();
        int marlene = 225;
        int total = chico + bento + bernardo + marina + iara + marlene;

        System.out.println(total);

        scan.close();
    
    }
}