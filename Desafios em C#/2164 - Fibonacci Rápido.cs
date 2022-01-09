using System; 

//Developed by: @LucasMarcuzo

class URI {

    static void Main(string[] args) { 

        int n = int.Parse(Console.ReadLine());

        double result = ((Math.Pow(((1 + Math.Sqrt(5))/2), n) - Math.Pow(((1 - Math.Sqrt(5))/2), n)) / (Math.Sqrt(5)));

        Console.WriteLine("{0:F1}",result);

    }

}