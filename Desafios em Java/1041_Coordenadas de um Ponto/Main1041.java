//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1041 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        float x, y, z=0.0f;
    
        x=scan.nextFloat();
        y=scan.nextFloat();
    
        if(x == z && y == z){
            System.out.println("Origem");   
        }else if(x == z){               
            System.out.println("Eixo Y");   
        }else if(y == z){       
            System.out.println("Eixo X");
        }else if(x > z && y > z){  
            System.out.println("Q1");  
        }else if(x < z && y > z){
            System.out.println("Q2");
        }else if(x < z && y < z){
            System.out.println("Q3");     
        }else if(x > z && y < z){
            System.out.println("Q4");     
        }
        scan.close();
    }        
}
