using System; 

//Developed by: @LucasMarcuzo

class URI1154 {

    static void Main(string[] args) { 

        int x, y=0, cont=0;

        do
        {
            x=int.Parse(Console.ReadLine());

            if(x>0)
            {
                y += x;
                cont++;
            }
            
        } while (x > 0);

        float z=(float)y/cont;

        Console.WriteLine("{0:f2}",z);
    }
}

