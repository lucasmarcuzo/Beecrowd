//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1921 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        long N = scan.nextLong();

        long total = (( N * N ) - ( 3 * N )) / 2;  

        System.out.println(total);

        scan.close();

    }
    
}

    
