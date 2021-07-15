using System; 

//Developed by: @LucasMarcuzo
class URI1036 {

    static void Main(string[] args) { 

        double a, b, c, r1, r2;

        String linha = Console.ReadLine();

        string[] valor = linha.Split(' ');
        a=double.Parse(valor[0]);
        b=double.Parse(valor[1]);
        c=double.Parse(valor[2]);


        if((a == 0) || (((b*b) - (4*a*c)) < 0)) 
        {  
            Console.WriteLine("Impossivel calcular");
        
        }
        else
        {
        
            r1 = ((-b + Math.Sqrt(((b*b) - (4*a*c)))) / (2*a));
            r2 = ((-b - Math.Sqrt(((b*b) - (4*a*c)))) / (2*a));

            Console.WriteLine("R1 = {0:f5}", r1);
            Console.WriteLine("R2 = {0:f5}", r2);

        }
    }
}