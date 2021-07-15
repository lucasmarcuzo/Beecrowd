using System; 

//Developed by: @LucasMarcuzo
class URI1078 {
    static void Main(string[] args) { 

        int i;

        i=int.Parse(Console.ReadLine());

        int[] dividends = {i};

        int[] divisors = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        foreach (int divisor in divisors)
        {
        foreach (int dividend in dividends)
        {

            long longResult = Math.BigMul(dividend, divisor);
            Console.WriteLine("{1} x {0} = {2}", dividend, divisor, longResult);
        }
        }

    }

}