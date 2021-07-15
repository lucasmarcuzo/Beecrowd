using System; 

//Developed by: @LucasMarcuzo
class URI1038 {

    static void Main(string[] args) { 

        int x, y;
        double z;
        int[] cod = {1,2,3,4,5};
        double[] valor = {4.00, 4.50, 5.00, 2.00, 1.50};

        String linha = Console.ReadLine();

        string[] array = linha.Split(' ');
        x=int.Parse(array[0]);
        y=int.Parse(array[1]);

        if(x == cod[0])
        {

            z=(double)(y * valor[0]);
            Console.WriteLine("Total: R$ {0:f}",z);

        }else if(x == cod[1])
        {

            z=(double)(y * valor[1]);
            Console.WriteLine("Total: R$ {0:f}",z);

        }else if(x == cod[2])
        {

            z=(double)(y * valor[2]);
            Console.WriteLine("Total: R$ {0:f}",z);

        }else if(x == cod[3])
        {

            z=(double)(y * valor[3]);
            Console.WriteLine("Total: R$ {0:f}",z);
        
        }else if(x == cod[4])
        {

            z=(double)(y * valor[4]);
            Console.WriteLine("Total: R$ {0:f}",z);

        }
    }
}