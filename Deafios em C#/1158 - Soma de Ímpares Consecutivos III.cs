using System; 

//Developed by: @LucasMarcuzo

class URI1158 {

    static void Main(string[] args) { 
    
        int n, x, y, z, j;

        n=int.Parse(Console.ReadLine());

        for (int i = 0; i < n; i++)
        {
            string[] l = Console.ReadLine().Split(' ');

            x = int.Parse(l[0]);
            y = int.Parse(l[1]);
            
            z=0;
            j=0;

            do
            {
                if(x % 2 != 0)
                {
                    z+=x;
                    j++;
                }
                x++;
                
            } while (j != y); 

            Console.WriteLine(z);
        }
    }
}