using System; 

//Developed by: @LucasMarcuzo
class URI1134 {

    static void Main(string[] args) { 

        int n, a, b, c;
        n=a=b=c=0;

        do
        {   
            n=int.Parse(Console.ReadLine());

            if(n >=1 && n <= 3){

                if(n == 1){
                    a++;
                }else if(n == 2){
                    b++;
                }else if(n == 3){
                    c++;
                }

            }
            
        } while (n != 4);

        Console.WriteLine("MUITO OBRIGADO");
        Console.WriteLine("Alcool: {0}", a);
        Console.WriteLine("Gasolina: {0}", b);
        Console.WriteLine("Diesel: {0}", c);

    }
}