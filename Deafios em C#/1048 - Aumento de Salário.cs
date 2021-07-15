using System; 

//Developed by: @LucasMarcuzo
class URI1048 {
    static void Main(string[] args) { 

        double a, b=0, c=0;
        int  d=0;
        char ch='%';

        a=double.Parse(Console.ReadLine());

        if(a>=0 && a<=400.00)
        {
            b=a*0.15;
            c=a+b;
            d=15;

        }else if(a>=400.01 && a<=800.00)
        {
            b=a*0.12;
            c=a+b;
            d=12;

        }else if(a>=800.01 && a<=1200.00)
        {
            b=a*0.10;
            c=a+b;
            d=10;

        }else if(a>=1200.01 && a<=2000.00)
        {
            b=a*0.07;
            c=a+b;
            d=7;

        }else if(a>2000.00)
        {
            b=a*0.04;
            c=a+b;
            d=4;
        }

        Console.WriteLine("Novo salario: {0:000.00}", c);
        Console.WriteLine("Reajuste ganho: {0:00.00}",b);
        Console.WriteLine("Em percentual: {0} {1}", d, ch);

    }

}