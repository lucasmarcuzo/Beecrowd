//Developed by: @LucasMarcuzo

import java.io.IOException;
import java.util.Scanner;
 
public class Main2374 {
 
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
 
        int A = scan.nextInt();
        int B = scan.nextInt();    
        
        int total = A - B;
        
        System.out.println(total);

        scan.close();
 
    }
 
}