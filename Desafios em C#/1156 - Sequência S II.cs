using System; 

//Developed by: @LucasMarcuzo

class Uri {

    static void Main(string[] args) { 

        double num = 0, j = 1;

        for (int i = 1; i <= 39;)
        {
            num += (i / j);
            i += 2;
            j *= 2;
        }   

        Console.WriteLine("{0:0.00}",Math.Round(num));

    }

}