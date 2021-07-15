using System; 

//Developed by: @LucasMarcuzo

class URI1865 {

    static void Main(string[] args) { 

        string x;
        int y;
        int n=int.Parse(Console.ReadLine());

        for (int i = 0; i < n; i++)
        {
            x="";
            y=0;

            string[] l = Console.ReadLine().Split(' ');

            x = (l[0]);
            y = int.Parse(l[1]);

            if(x == "Thor"){

                Console.WriteLine("Y");

            }else{

                Console.WriteLine("N");
            }
 
        }
    }
}