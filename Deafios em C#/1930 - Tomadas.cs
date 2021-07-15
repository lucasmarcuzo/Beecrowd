using System; 

//Developed by: @LucasMarcuzo
class URI1930 {

    static void Main(string[] args) { 

        int y=0;

        int[] x = new int[4];

        string[] l = Console.ReadLine().Split(' ');

        x[0]=int.Parse(l[0]);
        x[1]=int.Parse(l[1]);
        x[2]=int.Parse(l[2]);
        x[3]=int.Parse(l[3]);

        for (int i = 0; i < 3; i++)
        {
            y+=x[i]-1;
            
        }

        Console.WriteLine("{0}", y+x[3]);

    }

}