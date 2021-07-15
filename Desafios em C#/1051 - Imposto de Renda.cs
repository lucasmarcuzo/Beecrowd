using System; 
using System.Globalization;

class URI {

    static void Main(string[] args) { 

       double x=0;

       x=double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);

       if (x <= 2000.00f)
       {
           Console.WriteLine("Isento");
       }
       else if (x <= 3000.00f)
       {
           x -= 2000.00f;
           x *= 0.08;
           Console.WriteLine("R$ {0:F2}",x);
       }
       else if (x <= 4500.00f)
       {
           x -= 3000.00f;
           x *= 0.18;
           x += (1000 * 0.08);
           Console.WriteLine("R$ {0:F2}",x);
       }
       else
       {
           x -= 4500.00f;
           x *= 0.28;
           x += (1500 * 0.18) + (1000 * 0.08) ;
           Console.WriteLine("R$ {0:F2}",x);

       }
    }

}