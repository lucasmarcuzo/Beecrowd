using System; 

//Developed by: @LucasMarcuzo
class URI1075 {

    static void Main(string[] args) { 

        int n;

        n=int.Parse(Console.ReadLine());

       for(int i = 0; i <10000; i++)
       {
           
           if(i % n == 2)
           {
                Console.WriteLine(i);
           }

       }

    }

}