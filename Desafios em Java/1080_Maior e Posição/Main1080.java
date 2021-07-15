//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1080 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int x, y, z;
        x=y=z=0;

        for(int i = 1; i < 101; i++){

            x=scan.nextInt();

            if(x > y){
                y = x;
                z=i;
            }
        }

        System.out.println(y);
        System.out.println(z);

        scan.close();

    }
    
}