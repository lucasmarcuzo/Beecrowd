//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1146 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int x=1;

        int n=scan.nextInt();

        while(x <= n){

            if(n == 0){
                break;
            }
            else{
                if (x == n) {
                    System.out.print(x + "\n");
                    x=0;
                    n=scan.nextInt();
                }else 
                    System.out.print(x + " ");
            }
            x++;
        }   
    }
}