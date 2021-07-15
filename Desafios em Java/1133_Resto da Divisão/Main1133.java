//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1133 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int x, y;

        x=scan.nextInt();
        y=scan.nextInt();

        if(x > y){   

            for (int j = y+1; j < x; j++){
                
                if (j % 5 == 2 || j % 5 == 3){

                    System.out.println(j);

                }
             }

        }else{
            
            for (int k = x+1; k < y; k++){
                
                    if (k % 5 == 2 || k % 5 == 3){

                        System.out.println(k);

                    }
            }
        }

        scan.close();
    
    }
}