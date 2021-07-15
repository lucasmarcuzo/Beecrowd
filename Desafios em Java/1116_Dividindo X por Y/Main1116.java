//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1116 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n, x, y, i;
        float resultado = 0;
        
        n=scan.nextInt();

        for (i = 0; i < n; i++){

            x = scan.nextInt();
            y = scan.nextInt();
            
            if (y == 0){

                System.out.println("divisao impossivel");

            }else{

            resultado = (float)x/y;
                System.out.printf("%.1f\n", resultado);

            }
        }    

        scan.close();
    
    }
}