using System; 

//Developed by: @LucasMarcuzo
class URI1080 {
    static void Main(string[] args) { 

        int x, y, z;
        x=y=z=0;

        for(int i = 1; i < 101; i++)
        {

            x=int.Parse(Console.ReadLine());

            if(x > y)
            {
                y = x;
                z=i;
            }
        }

        Console.WriteLine(y);
        Console.WriteLine(z);
    }
}