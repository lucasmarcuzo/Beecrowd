using System; 

//Developed by: @LucasMarcuzo
class URI {

    static void Main(string[] args) { 

        int x, z, y, i=0;

        x=int.Parse(Console.ReadLine());

        do
        {
            z=int.Parse(Console.ReadLine());

        } while (z <= x);

            y=x;
            x=0;

            while (x <= z)
            {
                x+=y++;
                i++;
            } 

        
        Console.WriteLine(i);


    }

}