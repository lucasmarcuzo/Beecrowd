using System; 
using System.Globalization;

//Developed by: @LucasMarcuzo
class URI1117 {
    static void Main(string[] args) { 

        double m, n, t;

        do
        {
            m=double.Parse(Console.ReadLine(),CultureInfo.InvariantCulture);

            if(m < 0.0f || m > 10.0f)
            {
                Console.WriteLine("nota invalida");
            }
            
        } while (m < 0.0f || m > 10.0f);

        do
        {
            n=double.Parse(Console.ReadLine(),CultureInfo.InvariantCulture);

            if(n < 0.0f || n > 10.0f)
            {
                Console.WriteLine("nota invalida");
            }
    
        } while (n < 0.0f || n > 10.0f);

       
        t=(m+n)/2;

        Console.WriteLine("media = {0:0.00}",t);

    }

}