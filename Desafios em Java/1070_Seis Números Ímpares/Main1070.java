//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1070 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int x;

        x=scan.nextInt();

            if(x % 2 == 0){

                x++;
                for(int i=0; i<6; i++){

                    System.out.println(x);
                    x+=2;
                }

            }else if(x % 2 != 0){

                for(int i=0; i<6; i++){

                    System.out.println(x);
                    x+=2;
                }
                
            }


        scan.close();

    }
    
}