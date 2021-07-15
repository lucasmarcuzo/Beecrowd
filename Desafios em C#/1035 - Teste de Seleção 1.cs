using System; 

//Developed by: @LucasMarcuzo

class URI {

    static void Main(string[] args) { 

        int a, b, c, d;

        String linha = Console.ReadLine();

        string[] valor = linha.Split(' ');
        a=int.Parse(valor[0]);
        b=int.Parse(valor[1]);
        c=int.Parse(valor[2]);
        d=int.Parse(valor[3]);

        int cd=c+d;
        int ab=a+b;

        if(b > c && d > a && cd > ab && c > 0 && d > 0)
        {

            if(a % 2 == 0)
            {
                Console.WriteLine("Valores aceitos");
            
            }else
            {
                Console.WriteLine("Valores nao aceitos");
            }     
        }else
        {
            Console.WriteLine("Valores nao aceitos");
        }
    }
}