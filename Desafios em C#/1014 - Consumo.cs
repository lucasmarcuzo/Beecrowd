using System; 

//Developed by: @LucasMarcuzo

class URI1014 {

    static void Main(string[] args) { 

        int x;
        double y, total;

        x=int.Parse(Console.ReadLine());
        y=double.Parse(Console.ReadLine());

        total=x/y;

        Console.WriteLine("{0:0.000} km/l",total);

    }

}