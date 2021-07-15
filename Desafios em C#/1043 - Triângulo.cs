using System; 
using System.Globalization;

//Developed by: @LucasMarcuzo
class URI1043 {

    static void Main(string[] args) { 

        double a, b, c, perimetro, area;

        string[] vet;
        vet = Console.ReadLine().Split(' ');
        a = double.Parse(vet[0], CultureInfo.InvariantCulture);
        b = double.Parse(vet[1], CultureInfo.InvariantCulture);
        c = double.Parse(vet[2], CultureInfo.InvariantCulture);

        if (b - c < a && b - c < b + c && a - c < b && a - c < a + c && a - b < c && a - b < a + b) 
        {
            perimetro = a + b + c;
            Console.WriteLine("Perimetro = " + perimetro.ToString("F1", CultureInfo.InvariantCulture));
        }
        else 
        {
            area = ((a+b) * c )/ 2;
            Console.WriteLine("Area = " + area.ToString("F1", CultureInfo.InvariantCulture));
        }

    }

}