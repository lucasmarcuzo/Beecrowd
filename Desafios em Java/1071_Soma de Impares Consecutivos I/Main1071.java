//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1071 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int a, b, y=0;

        a=scan.nextInt();
        b=scan.nextInt();

        if(a == b){
        
            y=0;
        
        }else if(a < b){
        
            for(a= a+1; a < b; a++){
                
                if(a%2==1||a%2==-1)
                y+=a;
            }
    
        }else if(a > b){
        
            for(b= b+1; b < a; b++){
                
                if(b%2==1||b%2==-1)
                y+=b;
            }
  
        } 
        
        System.out.println(y);  

        scan.close();

    }
    
}