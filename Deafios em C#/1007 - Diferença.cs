using System; 

//Developed by: @LucasMarcuzo

class URI1007 {

    static void Main(string[] args) { 

        int a, b, c, d, dif;

        a=Convert.ToInt32(Console.ReadLine());
        b=Convert.ToInt32(Console.ReadLine());
        c=Convert.ToInt32(Console.ReadLine());
        d=Convert.ToInt32(Console.ReadLine());

        dif=(a * b - c * d);

        Console.WriteLine("DIFERENCA = {0}", dif);

    }

}