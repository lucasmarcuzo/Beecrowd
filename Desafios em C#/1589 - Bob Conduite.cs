using System; 

//Developed by: @LucasMarcuzo

class URI1589 {

    static void Main(string[] args) { 

        int n=int.Parse(Console.ReadLine());

        for (int i = 0; i < n; i++)
        {
            int t =0, r1=0, r2=0;

            string[] l = Console.ReadLine().Split(' ');

            r1 = int.Parse(l[0]);
            r2 = int.Parse(l[1]);

            t=r1+r2;

            Console.WriteLine(t);
        
        }
    }
}