//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1075 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n;

        n=scan.nextInt();

        for(int i = 0; i <10000; i++){
           
            if(i % n == 2){
                System.out.println(i);
            }
        }

        scan.close();

    }
    
}