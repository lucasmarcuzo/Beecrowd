//Developed by: @LucasMarcuzo

import java.io.IOException;
import java.util.*;
 
public class Main1759 {
 
    public static void main(String[] args) throws IOException {
        
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        
        for (int i = 0; i < N; i++) 
        {
            if (i < N-1) 
            {
                System.out.print("Ho ");  
            }
            else
            {
               System.out.println("Ho!");
            }
        }
       
    }
 
}