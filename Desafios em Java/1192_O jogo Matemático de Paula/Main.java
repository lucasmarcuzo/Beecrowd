//developed by: @lucasMarcuzo

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        for (int i = 0; i < N; i++) {
        
            String valor = scan.next();
            Integer N1 = Integer.parseInt(valor.substring(0, 1));
            Integer N2 = Integer.parseInt(valor.substring(2));
            Character x = valor.substring(1, 2).charAt(0);
            
            if (N1.equals(N2)) 
            {
                System.out.println(N1 * N2);
            } 
            else 
            {
                if (Character.isUpperCase(x))
                {
                    System.out.println(N2 - N1);
                } 
                else 
                {
                    System.out.println(N2 + N1);
                }
            }
        }
    }
}