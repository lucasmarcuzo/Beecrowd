using System; 

//Developed by: @LucasMarcuzo
class URI1015 {

    static void Main(string[] args) { 

        double distancia, x, y;

        String linha1 = Console.ReadLine();
        String linha2 = Console.ReadLine();

        string[] i = linha1.Split(' ');
        string[] j = linha2.Split(' ');

        double x1=double.Parse(i[0]);
        double y1=double.Parse(i[1]);
        double x2=double.Parse(j[0]);
        double y2=double.Parse(j[1]);
        
        
        distancia = Math.Sqrt(Math.Pow(x=(x2-x1),2) + Math.Pow(y=(y2-y1),2));

        Console.WriteLine("{0:0.0000}",distancia);

    }

}