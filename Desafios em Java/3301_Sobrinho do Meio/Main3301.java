//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main3301 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int H, Z, L;

        H=scan.nextInt();
        Z=scan.nextInt();
        L=scan.nextInt();

        if(H > Z && H < L || H < Z && H > L)
        {
            System.out.println("huguinho");
        }
        else if(H < Z && Z < L || H > Z && L < Z )
        {
            System.out.println("zezinho");
        }
        else if (H > Z && L > Z || H < Z && H < L)
        {
            System.out.println("luisinho");
        }      

    
        scan.close();
        
    }
}



