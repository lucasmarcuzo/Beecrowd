using System; 

//Developed by: @LucasMarcuzo

class URI1011 {

    static void Main(string[] args) { 

        double r, v=(4/3.0), i=3.14159, total;

        double vol=Convert.ToDouble(v);
        double pi=Convert.ToDouble(i);
        r=Convert.ToDouble(Console.ReadLine());
        r=Convert.ToDouble(Math.Pow(r, 3));

        total=vol*pi*r;

        Console.WriteLine("VOLUME = " + total.ToString("F3"));

    }

}