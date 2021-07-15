using System;

//Developed by: @LucasMarcuzo

class URI1005 {
    static void Main(string[] args) {

        double a, b;

        a = Convert.ToDouble(Console.ReadLine());
        b=Convert.ToDouble(Console.ReadLine());

        Console.WriteLine("MEDIA = " + ((a*3.5 + b*7.5)/(3.5+7.5)).ToString("0.00000"));
        Console.ReadKey();

    }
}
