//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1115 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        float x, y, z=0.0f;

        do{

            x=scan.nextFloat();
            y=scan.nextFloat();

            if(x > z && y > z){

                System.out.println("primeiro");

            }else if(x < z && y > z){

                System.out.println("segundo");

            }else if(x < z && y < z){

                System.out.println("terceiro");
        
            }else if(x > z && y < z){

                System.out.println("quarto");
            }
        
        }while(x != 0 && y != 0);


        scan.close();
    
    }
}