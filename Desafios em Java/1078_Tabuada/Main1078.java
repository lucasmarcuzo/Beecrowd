//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1078 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int i;

        i=scan.nextInt();

        int[] dividends = {i};

        int[] divisors = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int divisor : divisors)
        {
            for (int dividend : dividends)
            {
                long longResult = Math.multiplyFull(dividend, divisor);
                System.out.printf("%d x %d = %d\n",divisor, dividend, longResult);
            }
        }

        scan.close();

    }
    
}