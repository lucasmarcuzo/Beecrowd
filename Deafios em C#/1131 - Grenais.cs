using System; 

//Developed by: @LucasMarcuzo
class URI1131 {
    static void Main(string[] args) { 

       int x, y, i, g, e, s, grenais;
       x=y=i=g=e=s=grenais=0;

       do
       {
            string[] array = Console.ReadLine().Split(' ');

            x=int.Parse(array[0]);
            y=int.Parse(array[1]);

           if(x > y)
           {
               i++;
               grenais++;
            
           }else if(y > x)
           {
               g++;
               grenais++;
           }else
           {
               e++;
               grenais++;
           }

           Console.WriteLine("Novo grenal (1-sim 2-nao)");
           s=int.Parse(Console.ReadLine());
           
       } while (s == 1);


       if (i > g)
       {
           Console.WriteLine("{0} grenais",grenais);
           Console.WriteLine("Inter:{0}",i);
           Console.WriteLine("Gremio:{0}",g);
           Console.WriteLine("Empates:{0}",e);
           Console.WriteLine("Inter venceu mais");

       }else if (g > i)
       {
           Console.WriteLine("{0} grenais",grenais);
           Console.WriteLine("Inter:{0}",i);
           Console.WriteLine("Gremio:{0}",g);
           Console.WriteLine("Empates:{0}",e);
           Console.WriteLine("Gremio venceu mais");

       }else
       {
           Console.WriteLine("{0} grenais",grenais);
           Console.WriteLine("Inter:{0}",i);
           Console.WriteLine("Gremio:{0}",g);
           Console.WriteLine("Empates:{0}",e);
           Console.WriteLine("Nao houve vencedor");
       }

    }
}