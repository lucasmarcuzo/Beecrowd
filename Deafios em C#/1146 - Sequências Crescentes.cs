using System; 

//Developed by: @LucasMarcuzo

class URI1146 {

    static void Main(string[] args) { 

       int n;

       do
       {
          n=int.Parse(Console.ReadLine());

          for (int i = 1; i <= n; i++)
          {
              if(i < n)
              {
                  Console.Write("{0} ",i);
              }else
              {
                  Console.Write("{0}\n",i);
              }
              
          }
           
       } while (n != 0);

    }

}