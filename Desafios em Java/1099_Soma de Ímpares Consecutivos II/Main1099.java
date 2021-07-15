//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1099 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int x, y, z, z1, z2;
        x=y=z=0;
 
        z=scan.nextInt();
 
        for (int i = 0; i < z; i++){
 
            x=scan.nextInt();
            y=scan.nextInt();
            z1=z2=0;
 
 
            if(x > y){   
    
                for (int j = y+1; j < x; j++){
                    
                    if (j % 2 != 0){

                        z1 += j;
                    }
                }
                
                    System.out.println(z1);
    
            }else{
                
                for (int k = x+1; k < y; k++){
                    
                    if (k % 2 != 0){

                        z2 += k;

                    }
                }
                    System.out.println(z2);
            }
 
        }

        scan.close();
    
    }
}