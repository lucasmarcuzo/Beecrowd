using System; 

//Developed by: @LucasMarcuzo
class URI1074 {
    static void Main(string[] args) { 

        int N,X,a;
    
        N=int.Parse(Console.ReadLine());

        for(a=1;a<=N;a++){

            X=int.Parse(Console.ReadLine());

            if(X==0){

                Console.WriteLine("NULL");

            }else if(X<=0&&X%2==0){

                Console.WriteLine("EVEN NEGATIVE");

            }else if(X<=0&&X%2==-1){

                Console.WriteLine("ODD NEGATIVE");

            }else if(X>=0&&X%2==0){

                Console.WriteLine("EVEN POSITIVE");

            }else if(X>=0&&X%2==1){

                Console.WriteLine("ODD POSITIVE");
            }
        }
    }
}
    

