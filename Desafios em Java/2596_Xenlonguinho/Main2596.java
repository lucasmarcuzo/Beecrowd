import java.util.*;

class Main2596{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int x = scan.nextInt();

        for (int i = 0; i < x; i++)
        {
            Long n = scan.nextLong();

            String n1 = Long.toUnsignedString(n);

            Long z = Long.valueOf(n1);
 
            System.out.printf("%.0f\n", z - (Math.floor(Math.sqrt(z))));
        }
    }
}