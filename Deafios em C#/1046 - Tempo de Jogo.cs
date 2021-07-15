using System; 

//Developed by: @LucasMarcuzo
class URI1046 {

    static void Main(string[] args) 
    { 
        int x, y, z, w=60, v=24;

        string[] linha = Console.ReadLine().Split(' ');

        x = int.Parse(linha[0]);
        y = int.Parse(linha[1]);

        if(x < y)
        {

            z=((y*w-x*w)/w);
            Console.WriteLine("O JOGO DUROU {0} HORA(S)",z);

        }else if(x > y)
        {

            z=((v-x)+y);
            Console.WriteLine("O JOGO DUROU {0} HORA(S)",z);
            
        }else
        {
            z=24;
            Console.WriteLine("O JOGO DUROU {0} HORA(S)",z);
        }  
    }
}